package command;

public class DamageCommand implements Command{

    private Character receiver;


    public DamageCommand(Character receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.damage();
        receiver.powerDown();
    }

    @Override
    public void undo() {
        receiver.heal();
        receiver.powerUp();
    }
}
