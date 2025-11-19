public class Slime extends Enemy{
    Slime(int health, int damage, String name){
        super(health, damage, name);
    }
    @Override
    public void update(){
        System.out.println(this.name + " wiggles closer...");
    }
    @Override
    public void attack(){
        System.out.println(this.name + " spits a blob of goo!");
    }
}