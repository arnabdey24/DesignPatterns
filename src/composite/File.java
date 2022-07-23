package composite;

public class File implements Storage{

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int size() {
        System.out.println("File " + name + ", size: " + size);
        return size;
    }
}
