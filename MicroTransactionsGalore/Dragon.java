public class Dragon extends Enemy{
    Dragon(int health, int damage, String name){
        super(health, damage, name);
    }
    @Override
    public void update(){
        System.out.println(this.name + " circles the battlefield from above.");
    }
    @Override
    public void attack(){
        System.out.println(this.name + " breathes a massive fire blast!");
    }
}