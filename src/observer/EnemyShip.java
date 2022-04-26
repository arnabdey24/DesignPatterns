package observer;

public class EnemyShip implements Observer{

    private String name;

    public EnemyShip(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("Enemy Ship "+name+" also moved.");
    }

    @Override
    public void update() {
       move();
    }
}
