package decorator;

public class Cafechino implements Beverage{

    @Override
    public String getDescription() {
        return "Cafechino";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
