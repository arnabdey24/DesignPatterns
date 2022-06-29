package command.ex;

public class ToggleCommand implements Command{

    private AirConditioner receiver;

    public ToggleCommand(AirConditioner receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.toggle();
    }
}
