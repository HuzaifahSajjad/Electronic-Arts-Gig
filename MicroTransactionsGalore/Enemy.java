public abstract class Enemy {
    protected int health;
    protected int damage;
    protected String name;
    Enemy(int health, int damage, String name){
        this.health = health;
        this.damage = damage;
        this.name = name;
    }
    public abstract void update();
    public abstract void attack();
    // TODO: Create a concrete takeDamage(int amount) method
    public void takeDamage(int amount){
        this.health -= amount;
        System.out.println(this.name + " takes " + amount + " damage! Remaining health: " + this.health + "\n");
    }
    // TODO: Add a getName() method
    public void getName(){
        System.out.println("=== " + this.name + " ===");
    }
}