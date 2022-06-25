package prototype;

public class Client {
    public static void main(String[] args) {
        Library library1=new Library("1");
        library1.addBook("A");
        library1.addBook("D");

        Library library2= (Library) library1.clone();
        library2.addBook("C");

        System.out.println(library1);
        System.out.println(library2);

    }
}
