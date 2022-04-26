package mediator;

public class LevelTwoMediator implements Mediator{

    @Override
    public void shoot(Fighter from, Fighter to) {
        to.setHealth(to.getHealth()-5);
        if(to.getHealth()<=0){
            from.setPoint(from.getPoint()+10);
        }
    }
}
