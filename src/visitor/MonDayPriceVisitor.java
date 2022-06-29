package visitor;

public class MonDayPriceVisitor implements Visitor{

    @Override
    public double visit(Visitable visitable) {
        if(visitable instanceof CocaCola){
            return ((CocaCola) visitable).getSize()*70;
        }else if(visitable instanceof Mojo){
            return ((Mojo) visitable).getSize()*60;
        }else{
            return ((Pepsi) visitable).getSize()*60;
        }
    }
}
