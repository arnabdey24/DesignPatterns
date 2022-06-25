package chainOfResponsibility.sortingExample;

public class SortByD extends Handler{

    @Override
    public int dispatch(Element o1, Element o2) {
        if(o1.getD()== o2.getD()){
            return super.dispatch(o1, o2);
        }else{
            return o1.getD() - o2.getD();
        }
    }
}
