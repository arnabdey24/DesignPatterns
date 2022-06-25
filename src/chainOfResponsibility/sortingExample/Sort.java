package chainOfResponsibility.sortingExample;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        Element[] elements={
                new Element(4,2,6,1),
                new Element(3,6,3,1),
                new Element(2,4,1,3),
                new Element(2,1,3,5),
                new Element(3,1,4,1),
                new Element(2,1,4,1),
                new Element(2,1,4,1)
        };

        Handler sorter1=new SortByA();
        Handler sorter2=new SortByB();
        Handler sorter3=new SortByC();
        Handler sorter4=new SortByD();

        sorter1.setNext(sorter2);
        sorter2.setNext(sorter3);
        sorter3.setNext(sorter4);

        Arrays.sort(elements, new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return sorter1.dispatch(o1, o2);
            }
        });

        for (Element element : elements) {
            System.out.println(element);
        }
    }
}
