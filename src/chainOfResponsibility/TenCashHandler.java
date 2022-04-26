package chainOfResponsibility;

public class TenCashHandler extends CashHandler{

    public TenCashHandler() {
    }

    public TenCashHandler(CashHandler nextCashHandler) {
        super(nextCashHandler);
    }

    @Override
    public void dispatch(int amount) {
        if(amount>=10){
            System.out.println(amount/10+" 10tk note");
            amount%=10;
        }

        super.dispatch(amount);
    }
}
