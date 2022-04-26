package mediator;

public class Fighter {

    private String name;
    private int health;
    private int point;
    private Mediator mediator;

    public Fighter(String name, Mediator mediator) {
        this.name=name;
        this.mediator=mediator;
        point=0;
        health=10;
    }

    public void shoot(Fighter otherFighter){
        mediator.shoot(this,otherFighter);
        if(otherFighter.getHealth()<=0){
            System.out.println(this+"------KILLED----->>"+otherFighter);
        }else{
            System.out.println(this+"------SHOOT----->"+otherFighter);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String toString() {
        return name+"[" +
                "health=" + health +
                ", point=" + point +
                ']';
    }
}
