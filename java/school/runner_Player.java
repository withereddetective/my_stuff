class Player{

    public static int numPlayers;
    private int x, y, z, dir, hp;
    private String name;

    public Player(){

        numPlayers++;
        x = 0;
        y = 0;
        z = 0;
        dir = 1;
        hp = 20;
        name = "P" + String.valueOf(numPlayers);

    }

    public Player(String name, int x, int y, int z){

        numPlayers++;
        this.x = x;
        this.y = y;
        this.z = z;
        dir = 1;
        hp = 20;
        this.name = name;

    }

    public Player(String name, int x, int y, int z, int hp, int dir){

        numPlayers++;
        this.x = x;
        this.y = y;
        this.z = z;

        if (dir >= 1 && dir <= 6){
            this.dir = dir;
        } else {
            this.dir = 1;
        }

        if (hp > 0){
            this.hp = hp;
        } else {
            this.hp = 0;
        }

        this.name = name;

    }

    public int getNumPlayers(){
        return numPlayers;
    }

    public String getName(){
        return name;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public int getHp(){
        return hp;
    }

    public int getDirection(){
        return dir;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nHealth: " + hp + "\nCoordinates: X " + x + " Y " + y + " Z " + z + "\nDirection: " + dir;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setDirection(int dir){
        this.dir = dir;
    }

    public void move(int dir, int units){
        switch (dir) {
            case 1:
                x += units;
                break;
            case 2:
                x -= units;
                break;
            case 3:
                y += units;
                break;
            case 4:
                y -= units;
                break;
            case 5:
                z += units;
                break;
            case 6:
                z -= units;
                break;
            default:
                System.out.println("\nINVALID DIRECTION\n");
                break;
        }
    }

    public void teleport(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void teleport(Player player){
        x = player.x;
        y = player.y;
        z = player.z;
    }

    public void attack(Player player, int damage){
        player.setHp(player.getHp() - damage);
    }

    public double getDistance(int x, int y, int z){
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2) + Math.pow((z - this.z), 2));
    }

    public double getDistance(Player player){
        return Math.sqrt(Math.pow((player.getX() - this.x), 2) + Math.pow((player.getY() - this.y), 2) + Math.pow((player.getZ() - this.z), 2));
    }

}

public class runner_Player {

    public static void printPlayerStatus(Player p1, Player p2, Player p3){

        System.out.println("\n");
        System.out.println(p1.toString());
        System.out.println("\n");
        System.out.println(p2.toString());
        System.out.println("\n");
        System.out.println(p3.toString());
        System.out.println("\n");

    }

    public static void main(String[] args) {
        
        Player p1 = new Player("player 1", 2, 7, 63, 1, 6);
        Player p2 = new Player("Xx_godslayer_xX", 2000, 3, 100);
        Player p3 = new Player();

        System.out.println(p1.getNumPlayers());
        printPlayerStatus(p1, p2, p3);

        System.out.println("\nAfter change 1:\n");
        p1.setHp(2);
        p2.setDirection(5);
        p3.move(3, 25);
        printPlayerStatus(p1, p2, p3);

        System.out.println("\nAfter change 2:\n");
        p1.teleport(4, 3, 2);
        p2.teleport(p1);
        p3.attack(p3, 100000);
        printPlayerStatus(p1, p2, p3);

        System.out.println("\nDistances:\n");
        System.out.println(p1.getDistance(1, 1, 1));
        System.out.println(p3.getDistance(p2));

    }
}
