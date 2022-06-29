package command.ex;

public class AirConditioner {

    private boolean on;
    private int temp;

    public AirConditioner() {
        on=false;
        temp=18;
    }

    public void toggle(){
        on=!on;
        if(on){
            System.out.println("Turned on.");
        }else{
            System.out.println("Turned off.");
        }
    }

    public void increaseTemperature(){
        if(temp<30){
            temp++;
            System.out.println("Temperature: "+temp);
        }else {
            System.out.println("Temperature already at 30.");
        }
    }

    public void decreaseTemperature(){
        if(temp>18){
            temp--;
            System.out.println("Temperature: "+temp);
        }else {
            System.out.println("Temperature already at 18.");
        }
    }
}
