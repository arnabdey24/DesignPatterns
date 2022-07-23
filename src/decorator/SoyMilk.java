package decorator;

public class SoyMilk extends BeverageWithAddOn{

    public SoyMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"\n\t\t with extra soy-milk";
    }

    @Override
    public double getCost() {
        return super.getCost()+3.0;
    }
}
