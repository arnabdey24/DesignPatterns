package visitor;

public class CocaCola implements Visitable{

    private double size;

    public CocaCola(double size) {
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
