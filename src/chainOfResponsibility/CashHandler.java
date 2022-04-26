package chainOfResponsibility;

public abstract class CashHandler {

    private CashHandler nextCashHandler;

    public CashHandler() {
    }

    public CashHandler(CashHandler nextCashHandler) {
        this.nextCashHandler = nextCashHandler;
    }

    public void dispatch(int amount){
        if(nextCashHandler!=null)nextCashHandler.dispatch(amount);
    }
}
