package command;

public class Dracula implements Character{

    private int power;

    public Dracula() {
        power=10;
    }

    @Override
    public void heal() {
        System.out.println("Healing");
    }

    @Override
    public void damage() {
        System.out.println("Damaging");
    }

    @Override
    public void powerUp() {
        power+=5;
        System.out.println("Power rise to : "+power);
    }

    @Override
    public void powerDown() {
        power-=5;
        System.out.println("Power down to : "+power);
    }
}
