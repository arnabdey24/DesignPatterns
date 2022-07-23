package decorator;

public class Client {
    public static void main(String[] args) {

        Beverage beverage=new SoyMilk(new SoyMilk(new Caramel(new Cafechino())));

        System.out.println("Description: "+beverage.getDescription());
        System.out.println("Cost: "+beverage.getCost());
    }
}
