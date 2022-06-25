package builder;

public class Phone {

    private String model;
    private String company;
    private int battery;
    private int camera;
    private int weight;
    private int height;

    public Phone(String model, String company, int battery, int camera, int weight, int height) {
        this.model = model;
        this.company = company;
        this.battery = battery;
        this.camera = camera;
        this.weight = weight;
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", battery=" + battery +
                ", camera=" + camera +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
