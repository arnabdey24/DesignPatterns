package singleton;

public class SingletonEager {

    private static SingletonEager instance=new SingletonEager();

    private SingletonEager() {
        System.out.println("Initialize");
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
