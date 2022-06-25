package builder;

public class Client {
    public static void main(String[] args) {
        Phone phone=new PhoneBuilder()
                .setBattery(20)
                .setCamera(12)
                .setCompany("xiaomi")
                .setModel("x3")
                .getPhone();

        System.out.println(phone);
    }
}
