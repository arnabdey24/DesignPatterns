package factory;

public class OSFactory {

    public OS getInstance(String OSName) throws Exception {
        if (OSName.equalsIgnoreCase("Windows")){
            return new Windows();
        }else if(OSName.equalsIgnoreCase("IOS")){
            return new IOS();
        }else if(OSName.equalsIgnoreCase("Android")){
            return new Android();
        }else {
            throw new Exception();
        }
    }
}
