package chainOfResponsibility;

public class FiftyCashHandler extends CashHandler{

    public FiftyCashHandler() {
    }

    public FiftyCashHandler(CashHandler nextCashHandler) {
        super(nextCashHandler);
    }

    @Override
    public void dispatch(int amount) {
        if(amount>=50){
            System.out.println(amount/50+" 50tk note");
            amount%=50;
        }

        super.dispatch(amount);
    }
}
