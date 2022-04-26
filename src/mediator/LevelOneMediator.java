package mediator;

public class LevelOneMediator implements Mediator{

    @Override
    public void shoot(Fighter from, Fighter to) {
        to.setHealth(to.getHealth()-2);
        if(to.getHealth()<=0){
            from.setPoint(from.getPoint()+10);
        }
    }
}
