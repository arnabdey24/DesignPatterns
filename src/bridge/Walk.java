package bridge;

public class Walk implements MoveLogic{

    @Override
    public void move() {
        moveRightLeg();
        moveLeftLeg();
    }

    private void moveRightLeg(){
        System.out.println("moving right leg");
    }

    private void moveLeftLeg(){
        System.out.println("moving left leg");
    }
}
