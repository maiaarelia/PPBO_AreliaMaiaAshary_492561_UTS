public class Enemy {
    private String name;
    private int hp;
    private int attackDamage;

    public Enemy(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public void attack() {
        System.out.println("Attack");
    }
}