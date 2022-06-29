package visitor;

public class Main {

    public static void main(String[] args) {

        Visitor monDayPriceVisitor=new MonDayPriceVisitor();
        Visitor sunDayPriceVisitor=new SunDayPriceVisitor();

        CocaCola cocaCola=new CocaCola(1);
        Mojo mojo=new Mojo(1);
        Pepsi pepsi=new Pepsi(1);


        System.out.println(cocaCola.accept(monDayPriceVisitor));
        System.out.println(mojo.accept(monDayPriceVisitor));
        System.out.println(pepsi.accept(monDayPriceVisitor));


        System.out.println();


        System.out.println(cocaCola.accept(sunDayPriceVisitor));
        System.out.println(mojo.accept(sunDayPriceVisitor));
        System.out.println(pepsi.accept(sunDayPriceVisitor));
    }
}
