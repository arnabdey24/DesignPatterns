package command.ex;

public class Driver {

    public static void main(String[] args) {

        AirConditioner airConditioner=new AirConditioner();

        Command toggle=new ToggleCommand(airConditioner);
        Command increase=new IncreaseCommand(airConditioner);
        Command decrease=new DecreaseCommand(airConditioner);


        Invoker invoker=new Invoker();
        invoker.setB1(toggle);
        invoker.setB2(increase);
        invoker.setB3(decrease);

        invoker.clickB1();
        invoker.clickB3();
    }
}
