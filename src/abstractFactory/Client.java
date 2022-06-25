package abstractFactory;

public class Client {

    public static void main(String[] args) {
        Shape shape=Shapes.getShapes("red").getShape("circle");

        shape.draw();
    }
}
