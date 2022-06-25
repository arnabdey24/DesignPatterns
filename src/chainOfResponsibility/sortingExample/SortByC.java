package chainOfResponsibility.sortingExample;

public class SortByC extends Handler{

    @Override
    public int dispatch(Element o1, Element o2) {
        if(o1.getC()== o2.getC()){
            return super.dispatch(o1, o2);
        }else{
            return o1.getC() - o2.getC();
        }
    }
}
