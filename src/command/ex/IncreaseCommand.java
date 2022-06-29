package command.ex;

public class IncreaseCommand implements Command{

    private AirConditioner receiver;

    public IncreaseCommand(AirConditioner receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.increaseTemperature();
    }
}
