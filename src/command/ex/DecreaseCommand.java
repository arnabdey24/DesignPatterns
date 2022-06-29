package command.ex;

public class DecreaseCommand implements Command{

    private AirConditioner receiver;

    public DecreaseCommand(AirConditioner receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.decreaseTemperature();
    }
}
