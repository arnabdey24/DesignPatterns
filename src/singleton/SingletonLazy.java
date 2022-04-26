package singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        System.out.println("Initialize");
    }

    public synchronized static SingletonLazy getInstance() {
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}
