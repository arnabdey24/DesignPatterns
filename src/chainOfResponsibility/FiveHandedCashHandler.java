package chainOfResponsibility;

public class FiveHandedCashHandler extends CashHandler{

    public FiveHandedCashHandler() {
    }

    public FiveHandedCashHandler(CashHandler nextCashHandler) {
        super(nextCashHandler);
    }

    @Override
    public void dispatch(int amount) {
        if(amount>=500){
            System.out.println(amount/500+" 500tk note");
            amount%=500;
        }

        super.dispatch(amount);
    }
}
