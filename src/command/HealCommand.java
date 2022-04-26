package command;

public class HealCommand implements Command{

    private Character receiver;

    public HealCommand(Character receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.heal();
        receiver.powerUp();
    }

    @Override
    public void undo() {
        receiver.damage();
        receiver.powerDown();
    }
}
