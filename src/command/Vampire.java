package command;

public class Vampire implements Character {

    private int power;

    public Vampire() {
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
        power++;
        System.out.println("Power rise to : "+power);
    }

    @Override
    public void powerDown() {
        power--;
        System.out.println("Power down to : "+power);
    }
}
