package chainOfResponsibility;

public class OneHandedCashHandler extends CashHandler{

    public OneHandedCashHandler() {
    }

    public OneHandedCashHandler(CashHandler nextCashHandler) {
        super(nextCashHandler);
    }

    @Override
    public void dispatch(int amount) {
        if(amount>=100){
            System.out.println(amount/100+" 100tk note");
            amount%=100;
        }

        super.dispatch(amount);
    }
}
