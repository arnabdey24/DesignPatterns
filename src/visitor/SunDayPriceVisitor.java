package visitor;

public class SunDayPriceVisitor implements Visitor{

    @Override
    public double visit(Visitable visitable) {
        if(visitable instanceof CocaCola){
            return ((CocaCola) visitable).getSize()*65;
        }else if(visitable instanceof Mojo){
            return ((Mojo) visitable).getSize()*55;
        }else{
            return ((Pepsi) visitable).getSize()*50;
        }
    }
}
