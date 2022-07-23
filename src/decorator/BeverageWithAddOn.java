package decorator;

public abstract class BeverageWithAddOn implements Beverage{

    private Beverage beverage;

    public BeverageWithAddOn(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }
}
