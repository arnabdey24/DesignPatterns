package template;

public abstract class Burger {

    private boolean cheese;
    private boolean naga;
    private boolean sauce;

    public void prepare(){

        cutBan();

        if(isCheese())addCheese();
        if(isNaga())addSpices();
        if(isSauce())addSauce();

        placeUpperBan();


    }

    public abstract void addSauce();

    public abstract void addSpices();

    public abstract void addCheese();

    private void placeUpperBan() {
        System.out.println("Upper ban placed!");
    }

    public void cutBan() {
        System.out.println("Split ban..");
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isNaga() {
        return naga;
    }

    public void setNaga(boolean naga) {
        this.naga = naga;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }
}
