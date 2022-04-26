package singleton;

public class Driver {
    public static void main(String[] args) {

        SingletonEager singletonEager=SingletonEager.getInstance();
        SingletonEager singletonEager0=SingletonEager.getInstance();

        SingletonLazy singletonLazy=SingletonLazy.getInstance();
        SingletonLazy singletonLazy0=SingletonLazy.getInstance();

    }
}
