public class Pocong extends Enemy{
    public Pocong(String name, int hp, int attackDamage) {

        super(name, hp, attackDamage);
    }

    public void jump(){
        System.out.println("Jump");
    }
}