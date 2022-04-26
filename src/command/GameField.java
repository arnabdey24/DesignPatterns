package command;

public class GameField {

    private Command command;

    public GameField() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void night(){
        command.execute();
    }

    public void day(){
        command.undo();
    }
}
