package abstractFactory;

public class RedShapes implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("circle")){
            return new RedCircle();
        }else if(shapeType.equals("rectangle")){
            return new RedRectangle();
        }else {
            return null;
        }
    }
}
