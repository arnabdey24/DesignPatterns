package decorator;

public class Caramel extends BeverageWithAddOn{

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"\n\t\t with extra caramel";
    }

    @Override
    public double getCost() {
        return super.getCost()+2.5;
    }
}
