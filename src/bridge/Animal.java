package bridge;

public abstract class Animal {

    private MoveLogic moveLogic;

    public Animal(MoveLogic moveLogic) {
        this.moveLogic = moveLogic;
    }

    public void move(){
        moveLogic.move();
    }
}
