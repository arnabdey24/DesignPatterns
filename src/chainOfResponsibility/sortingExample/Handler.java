package chainOfResponsibility.sortingExample;

public class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public int dispatch(Element o1, Element o2) {
        if(next==null){
            return 0;
        }
        return next.dispatch(o1, o2);
    }
}
