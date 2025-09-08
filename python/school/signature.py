class signedText:
    def __init__(self, firstName, lastName):
        self.firstName = firstName
        if len(lastName) < 1:
            raise ValueError("you didnt give a last name idiot")
        self.lastName = lastName
        self.x = None
    
    def getSignature(self):
        if self.x is None:
            if self.firstName == "":
                return self.lastName
            else:
                return self.firstName[0] + "-" + self.lastName
        else:
            return self.text + self.lastName
    
    def addSignature(self, text):
        self.text = text
        if self.lastName in text:
            self.x = True
            self.lastName = ""
        else:
            self.x = False
        
        if self.x == False:
            string = ""
            for i in self.lastName:
                string = string + i
                if string not in text:
                    string = string.replace(string[string.index(i)], "")
                    break
            self.lastName = self.lastName.replace(string, "")

st1 = signedText("", "FOX")
st1.addSignature("best wishesFO")
print(st1.getSignature())