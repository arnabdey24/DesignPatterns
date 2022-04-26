package command;

public class Driver {

    public static void main(String[] args) {
        Character vampire=new Vampire();
        Character dracula=new Dracula();

        Command healCommand=new HealCommand(vampire);
        Command damageCommand=new DamageCommand(vampire);

        GameField gameField=new GameField();
        gameField.setCommand(healCommand);

        gameField.day();
        gameField.night();


    }
}
