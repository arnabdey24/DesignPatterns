package chainOfResponsibility;

public class Driver {
    public static void main(String[] args) {
        CashHandler cashHandler=new ThousandCashHandler(
                new FiveHandedCashHandler(
                        new OneHandedCashHandler(
                                new FiftyCashHandler(
                                        new TenCashHandler(
                                                new FiveCashHandler(
                                                        new OneCashHandler()
                                                )
                                        )
                                )
                        )
                )
        );

        cashHandler.dispatch(5333);
    }
}
