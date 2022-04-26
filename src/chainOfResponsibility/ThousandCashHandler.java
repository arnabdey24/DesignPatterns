package chainOfResponsibility;

public class ThousandCashHandler extends CashHandler{

    public ThousandCashHandler() {
    }

    public ThousandCashHandler(CashHandler nextCashHandler) {
        super(nextCashHandler);
    }

    @Override
    public void dispatch(int amount) {
        if(amount>=1000){
            System.out.println(amount/1000+" 1000tk note");
            amount%=1000;
        }

        super.dispatch(amount);
    }
}
