package abstractFactory;

public class GreenShapes implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("circle")){
            return new GreenCircle();
        }else if(shapeType.equals("rectangle")){
            return new GreenRectangle();
        }else {
            return null;
        }
    }
}
