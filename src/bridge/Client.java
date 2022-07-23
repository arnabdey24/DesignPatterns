package bridge;

public class Client {

    public static void main(String[] args) {

        MoveLogic walk=new Walk();
        MoveLogic swim=new Swim();
        MoveLogic fly=new Fly();

        Animal human=new Human(walk);
        Animal bird=new Bird(fly);
        Animal fish=new Fish(swim);

        human.move();
        System.out.println();
        bird.move();
        System.out.println();
        fish.move();
    }
}
