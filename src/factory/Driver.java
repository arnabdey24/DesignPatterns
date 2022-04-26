package factory;

public class Driver {
    public static void main(String[] args) throws Exception {

        OSFactory osFactory=new OSFactory();

        OS os= osFactory.getInstance("windows");
        os.compute();
    }
}
