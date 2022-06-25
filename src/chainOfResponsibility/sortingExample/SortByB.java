package chainOfResponsibility.sortingExample;

public class SortByB extends Handler{

    @Override
    public int dispatch(Element o1, Element o2) {
        if(o1.getB()== o2.getB()){
            return super.dispatch(o1, o2);
        }else{
            return o1.getB() - o2.getB();
        }
    }
}
