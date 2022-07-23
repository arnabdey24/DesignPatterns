package bridge;

public class Fly implements MoveLogic{

    @Override
    public void move() {
        flapWings();
    }

    private void flapWings(){
        System.out.println("flapping wings");
    }
}
