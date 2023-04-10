public class Main {
    public static void main(String[] args) {

        Enemy enemy1 = new Enemy("Gatau", 124, 190);
        Burung burung1 = new Burung("Burung", 234, 10);
        Pocong pocong1 = new Pocong("Pocong", 120, 20);
        Zombie zombie1 = new Zombie("Zombie", 21, 0);

        enemy1.attack();
        burung1.fly();
        burung1.walk();
        zombie1.walk();
        pocong1.jump();


    }
}