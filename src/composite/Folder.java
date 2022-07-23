package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Storage{

    private String name;
    private List<Storage> list;

    public Folder(String name) {
        this.name = name;
        list=new ArrayList<>();
    }

    public void add(Storage element) {
        list.add(element);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int size() {
        int size=0;
        for (Storage s : list) {
            size+=s.size();
        }
        System.out.println(">>> Folder " + getName() + ", size: " + size);
        return size;
    }
}
