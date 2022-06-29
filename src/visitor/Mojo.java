package visitor;

public class Mojo implements Visitable{

    private double size;

    public Mojo(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
