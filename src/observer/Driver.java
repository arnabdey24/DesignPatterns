package observer;

public class Driver {
    public static void main(String[] args) {
        Ship ship=new Ship("MV-1");

        EnemyShip enemyShip=new EnemyShip("Killer master");
        EnemyShip enemyShip1=new EnemyShip("Black Dragon");

        ship.add(enemyShip);
        ship.add(enemyShip1);

        ship.move();
    }
}
