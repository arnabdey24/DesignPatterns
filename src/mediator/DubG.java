package mediator;

public class DubG {

    public static void main(String[] args) {

        Mediator levelOneMediator=new LevelOneMediator();

        Fighter arnab=new Fighter("arnab",levelOneMediator);
        Fighter siam=new Fighter("siam",levelOneMediator);

        arnab.shoot(siam);
        siam.shoot(arnab);
        arnab.shoot(siam);
        arnab.shoot(siam);
        arnab.shoot(siam);
        arnab.shoot(siam);

        System.out.println();
        System.out.println();

        Mediator levelTwoMediator=new LevelTwoMediator();

        Fighter billa=new Fighter("billa",levelTwoMediator);
        Fighter ratno=new Fighter("ratno",levelTwoMediator);

        ratno.shoot(billa);
        billa.shoot(ratno);
        ratno.shoot(billa);
    }
}
