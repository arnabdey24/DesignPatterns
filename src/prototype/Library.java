package prototype;

import java.util.ArrayList;

public class Library implements Prototype{

    private String name;
    private ArrayList<String> books;

    public Library(String name) {
        this.name = name;
        books=new ArrayList<>();
    }

    public void addBook(String book){
        books.add(book);
    }

    @Override
    public Prototype clone() {
        Library newLibrary=new Library(name);

        for (String book : books) {
            newLibrary.addBook(book);
        }

        return newLibrary;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
