package chainOfResponsibility;

public class FiveCashHandler extends CashHandler {

    public FiveCashHandler() {
    }

    public FiveCashHandler(CashHandler nextCashHandler) {
        super(nextCashHandler);
    }

    @Override
    public void dispatch(int amount) {
        if(amount>=5){
            System.out.println(amount/5+" 5tk note");
            amount%=5;
        }

        super.dispatch(amount);
    }
}
