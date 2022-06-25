package abstractFactory;

public class Shapes {
    public static ShapeFactory getShapes(String color){
        if(color.equals("red")){
            return new RedShapes();
        }else if(color.equals("green")){
            return new GreenShapes();
        }else return null;
    }
}
