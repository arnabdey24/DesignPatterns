package memento;

import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> mementos;

    public Caretaker() {
        mementos=new ArrayList<>();
    }

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
