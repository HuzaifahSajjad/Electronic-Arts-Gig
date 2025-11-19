public class Skeleton extends Enemy{
    Skeleton(int health, int damage, String name){
        super(health, damage, name);
    }
    @Override
    public void update(){
        System.out.println(this.name + " patrols the area cautiously.");
    }
    @Override
    public void attack(){
        System.out.println(this.name + " fires an arrow!");
    }
}