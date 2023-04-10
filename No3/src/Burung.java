public class Burung extends Enemy{
    public Burung(String name, int hp, int attackDamage) {
        super(name, hp, attackDamage);
    }

    public void fly(){
        System.out.println("Fly");
    }

    public void walk(){
        System.out.println("Walk");
    }
}
