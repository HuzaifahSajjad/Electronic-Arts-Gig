public class GameDriver {
    public static void main(String[] args) {
        // Enemy e = new Enemy();
        Enemy[] enemies = {new Slime(20, 2, "Green Slime"), new Skeleton(30, 10, "Skeleton Archer"), new Dragon(100, 985689374, "Ancient Dragon")};
        for (Enemy enemy : enemies){
            enemy.getName();
            enemy.update();
            enemy.attack();
            enemy.takeDamage(5);
        }
    }
}