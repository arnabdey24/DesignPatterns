package memento;

public class Client {

    private static Originator originator;
    private static Caretaker caretaker;
    private static String text;
    private static int cur=0;
    private static int total=0;

    public static void main(String[] args) {

        originator = new Originator();
        caretaker = new Caretaker();

        text = "My name";

        save();
        System.out.println(text);

        text=text+" is arnab";

        save();
        System.out.println(text);

        text=text+" and i'm a student";

        save();
        System.out.println(text);

        undo();
        System.out.println(text);

        undo();
        System.out.println(text);

        redo();
        System.out.println(text);






    }

    private static void save(){
        originator.setState(text);
        caretaker.add(originator.saveToMemento());
        total++;
        cur=total-1;
    }

    private static void undo(){
        cur--;
        if(cur<0) cur=0;
        originator.restoreFromMemento(caretaker.get(cur));
        text= originator.getState();
    }

    private static void redo(){
        cur++;
        if(cur==total) cur=total-1;
        originator.restoreFromMemento(caretaker.get(cur));
        text= originator.getState();
    }
}
