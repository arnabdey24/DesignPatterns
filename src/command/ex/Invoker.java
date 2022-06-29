package command.ex;

public class Invoker {

    private Command b1;
    private Command b2;
    private Command b3;

    public void setB1(Command b1) {
        this.b1 = b1;
    }

    public void setB2(Command b2) {
        this.b2 = b2;
    }

    public void setB3(Command b3) {
        this.b3 = b3;
    }

    public void clickB1(){
        b1.execute();
    }

    public void clickB2(){
        b2.execute();
    }

    public void clickB3(){
        b3.execute();
    }
}
