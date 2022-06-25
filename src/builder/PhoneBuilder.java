package builder;

public class PhoneBuilder {
    private String model;
    private String company;
    private int battery;
    private int camera;
    private int weight;
    private int height;


    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public PhoneBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public Phone getPhone(){
        return new Phone(model,company,battery,camera,weight,height);
    }
}

