package bridge;

public class Swim implements MoveLogic{

    @Override
    public void move() {
        moveTails();
    }

    private void moveTails(){
        System.out.println("moving tails");
    }
}
