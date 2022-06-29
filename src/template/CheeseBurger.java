package template;

public class CheeseBurger extends Burger{

    public CheeseBurger() {
        setCheese(true);
        setNaga(false);
        setSauce(true);
    }

    @Override
    public void addSauce() {
        System.out.println("Sauce added..");
    }

    @Override
    public void addSpices() {

    }

    @Override
    public void addCheese() {
        System.out.println("Cheese added..");
    }
}
