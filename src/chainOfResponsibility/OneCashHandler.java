package chainOfResponsibility;

public class OneCashHandler extends CashHandler{

    public OneCashHandler() {
    }

    public OneCashHandler(CashHandler nextCashHandler) {
        super(nextCashHandler);
    }

    @Override
    public void dispatch(int amount) {
        if(amount>=1){
            System.out.println(amount/1+" 1tk note");
            amount%=1;
        }

        super.dispatch(amount);
    }
}
