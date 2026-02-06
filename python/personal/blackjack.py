import sys
import os
import random
from PySide6.QtWidgets import (QApplication, QMainWindow, QWidget, QVBoxLayout, 
                             QHBoxLayout, QLabel, QPushButton, QDialog)
from PySide6.QtGui import QPixmap
from PySide6.QtCore import Qt, QPropertyAnimation, QPoint, QEasingCurve, QTimer, QSequentialAnimationGroup

def get_card_pixmap_static(num=None, suit_idx=None, is_back=False):
    # strings and paths in all lowercase
    base_dir = os.path.dirname(os.path.abspath(__file__))
    suits = {1: "clubs", 2: "diamonds", 3: "hearts", 4: "spades"}
    ranks = {1: "a", 11: "j", 12: "q", 13: "k"}
    filename = "card_back.png" if is_back else f"card_{suits[suit_idx]}_{ranks.get(num, f'{num:02d}')}.png"
    path = os.path.join(base_dir, "bj_assets", filename)
    if not os.path.exists(path): return QPixmap() 
    return QPixmap(path).scaled(100, 150, Qt.KeepAspectRatio, Qt.SmoothTransformation)

class CardWidget(QLabel):
    def __init__(self, card_data, is_hidden=False, parent=None):
        super().__init__(parent)
        self.card_data = card_data
        self.is_hidden = is_hidden
        self.setPixmap(get_card_pixmap_static(*card_data, is_back=is_hidden))
        self.setFixedSize(100, 150)

    def reveal(self):
        self.is_hidden = False
        self.setPixmap(get_card_pixmap_static(*self.card_data))

class BlackjackGUI(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("pyside6 blackjack")
        # 3. window is now shorter
        self.setFixedSize(600, 550) 
        self.setStyleSheet("background-color: #006400;")
        self.used_cards = set()
        self.player_cards = []
        self.dealer_cards = []
        self.dealer_widgets = []
        self.player_widgets = []
        self.init_ui()
        self.start_game()

    def init_ui(self):
        self.central = QWidget()
        self.setCentralWidget(self.central)
        self.main_layout = QVBoxLayout(self.central)
        
        # dealer row
        self.main_layout.addWidget(QLabel("dealer's hand:"))
        self.dealer_container = QWidget()
        self.dealer_container.setMinimumHeight(160)
        self.main_layout.addWidget(self.dealer_container)

        # player row
        self.main_layout.addWidget(QLabel("your hand:"))
        self.player_container = QWidget()
        self.player_container.setMinimumHeight(160)
        self.main_layout.addWidget(self.player_container)

        # 4. bigger text for win/loss
        self.result_label = QLabel("")
        self.result_label.setAlignment(Qt.AlignCenter)
        self.result_label.setStyleSheet("color: yellow; font-weight: bold; font-size: 32px;")
        self.main_layout.addWidget(self.result_label)

        self.totals_label = QLabel("")
        self.totals_label.setAlignment(Qt.AlignCenter)
        self.totals_label.setStyleSheet("color: white; font-size: 22px;")
        self.main_layout.addWidget(self.totals_label)

        self.btn_layout = QHBoxLayout()
        self.hit_btn = QPushButton("hit")
        self.stand_btn = QPushButton("stand")
        self.hit_btn.clicked.connect(self.player_hit_logic)
        self.stand_btn.clicked.connect(self.dealer_turn_logic)
        self.btn_layout.addWidget(self.hit_btn)
        self.btn_layout.addWidget(self.stand_btn)
        self.main_layout.addLayout(self.btn_layout)

        for lbl in self.findChildren(QLabel):
            lbl.setStyleSheet(lbl.styleSheet() + "color: white;")

    def draw_card(self):
        while True:
            card = (random.randint(1, 13), random.randint(1, 4))
            if card not in self.used_cards:
                self.used_cards.add(card)
                return card[0] # returning only the rank value for score simplicity

    def calculate_score(self, cards):
        total = sum([min(c, 10) for c in cards])
        if 1 in cards and total <= 11: total += 10
        return total

    def start_game(self):
        self.used_cards.clear()
        self.player_cards = []
        self.dealer_cards = []
        self.result_label.setText("")
        self.totals_label.setText("")
        
        for w in self.dealer_widgets + self.player_widgets:
            w.deleteLater()
        self.dealer_widgets = []
        self.player_widgets = []
        
        self.hit_btn.setEnabled(False)
        self.stand_btn.setEnabled(False)

        self.intro_group = QSequentialAnimationGroup()
        
        # initial cards (dealer fast, player slow)
        for _ in range(2):
            c = (random.randint(1, 13), random.randint(1, 4))
            self.dealer_cards.append(c[0])
            self.add_animated_card(c, self.dealer_container, self.dealer_widgets, 200, len(self.dealer_cards)==2)
            
        for _ in range(2):
            c = (random.randint(1, 13), random.randint(1, 4))
            self.player_cards.append(c[0])
            self.add_animated_card(c, self.player_container, self.player_widgets, 600, False)
        
        self.intro_group.finished.connect(self.enable_controls)
        self.intro_group.start()

    def add_animated_card(self, data, container, widget_list, duration, hidden):
        # Create card widget with container as parent
        card = CardWidget(data, is_hidden=hidden, parent=container)
        widget_list.append(card)
        card.show()
        
        # Calculate card position based on existing cards in hand
        card_width = 100
        spacing = 10
        x_pos = (len(widget_list) - 1) * (card_width + spacing) + 10
        y_pos = 5
        
        # Start from top center of container
        start_pos = QPoint(container.width() // 2 - 50, -150)
        end_pos = QPoint(x_pos, y_pos)
        
        anim = QPropertyAnimation(card, b"pos")
        anim.setDuration(duration)
        anim.setStartValue(start_pos)
        anim.setEndValue(end_pos)
        anim.setEasingCurve(QEasingCurve.OutCubic)
        self.intro_group.addAnimation(anim)

    def enable_controls(self):
        if self.calculate_score(self.player_cards) >= 21:
            self.dealer_turn_logic()
        else:
            self.hit_btn.setEnabled(True)
            self.stand_btn.setEnabled(True)

    def player_hit_logic(self):
        self.hit_btn.setEnabled(False)
        self.stand_btn.setEnabled(False)
        c = (random.randint(1, 13), random.randint(1, 4))
        self.player_cards.append(c[0])
        
        self.intro_group = QSequentialAnimationGroup()
        self.add_animated_card(c, self.player_container, self.player_widgets, 600, False)
        self.intro_group.finished.connect(self.enable_controls)
        self.intro_group.start()

    def dealer_turn_logic(self):
        self.hit_btn.setEnabled(False)
        self.stand_btn.setEnabled(False)
        # 5. reveal dealer cards immediately on stand
        if len(self.dealer_widgets) > 1:
            self.dealer_widgets[1].reveal()
            
        self.intro_group = QSequentialAnimationGroup()
        while self.calculate_score(self.dealer_cards) < 17:
            c = (random.randint(1, 13), random.randint(1, 4))
            self.dealer_cards.append(c[0])
            self.add_animated_card(c, self.dealer_container, self.dealer_widgets, 200, False)
        
        self.intro_group.finished.connect(self.end_game)
        self.intro_group.start()

    def end_game(self):
        p_score = self.calculate_score(self.player_cards)
        d_score = self.calculate_score(self.dealer_cards)
        
        # 4. win/loss logic (draw if both bust)
        if p_score > 21 and d_score > 21: msg = "it's a draw! (both bust)"
        elif p_score > 21: msg = "you lose! (bust)"
        elif d_score > 21: msg = "you win! (dealer bust)"
        elif p_score > d_score: msg = "you win!"
        elif d_score > p_score: msg = "you lose!"
        else: msg = "it's a tie!"
        
        self.result_label.setText(msg.lower())
        self.totals_label.setText(f"your: {p_score} | dealer: {d_score}")
        # 6. delayed play again
        QTimer.singleShot(2000, self.ask_play_again)

    def ask_play_again(self):
        dlg = QDialog(self)
        dlg.setWindowTitle("play again?")
        l = QVBoxLayout(dlg)
        l.addWidget(QLabel("would you like to play again?"))
        hb = QHBoxLayout()
        y, n = QPushButton("yes"), QPushButton("no")
        y.clicked.connect(dlg.accept); n.clicked.connect(dlg.reject)
        hb.addWidget(y); hb.addWidget(n)
        l.addLayout(hb)
        if dlg.exec(): self.start_game()
        else: self.close()

if __name__ == "__main__":
    app = QApplication(sys.argv)
    win = BlackjackGUI(); win.show()
    sys.exit(app.exec())
