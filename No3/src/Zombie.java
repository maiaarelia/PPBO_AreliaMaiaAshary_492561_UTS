public class Zombie extends Enemy{
    public Zombie(String name, int hp, int attackDamage) {

        super(name, hp, attackDamage);
    }

    public void walk(){
        System.out.println("Walk");
    }


}