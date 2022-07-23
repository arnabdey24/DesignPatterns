package adapter;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayList<T> {
    private final static int DEFAULT_CAPACITY = 100;
    private final static int NOT_FOUND = -1;

    protected int rear;
    protected T[] list;
    protected int modCount;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        rear = 0;
        list = (T[]) (new Object[initialCapacity]);
        modCount = 0;
    }

    protected void expandCapacity() {
        list = Arrays.copyOf(list, list.length * 2);
    }


    public void addToFront(T element) {
        if (size() == list.length)
            expandCapacity();

        // shift elements up one
        for (int scan = rear; scan > 0; scan--)
            list[scan] = list[scan - 1];

        list[0] = element;
        rear++;
        modCount++;
    }

    public void addToRear(T element) {
        if (size() == list.length)
            expandCapacity();

        list[rear] = element;
        rear++;
        modCount++;
    }

    public T removeLast() throws Exception {
        if (isEmpty())
            throw new Exception("ArrayList Empty");

        T result;
        rear--;
        result = list[rear];
        list[rear] = null;
        modCount++;

        return result;

    }


    public T removeFirst() throws Exception {
        if (isEmpty())
            throw new Exception("ArrayList Empty");

        T result = list[0];
        rear--;

        for (int scan = 0; scan < rear; scan++)
            list[scan] = list[scan + 1];

        list[rear] = null;
        modCount++;

        return result;
    }


    public T remove(T element) throws Exception {
        T result;
        int index = find(element);

        if (index == NOT_FOUND)
            throw new Exception("Element not found in list");

        result = list[index];
        rear--;

        // shift the appropriate elements
        for (int scan = index; scan < rear; scan++)
            list[scan] = list[scan + 1];

        list[rear] = null;
        modCount++;

        return result;
    }


    public T first() throws Exception {
        if (isEmpty())
            throw new Exception("ArrayList Empty");

        return list[0];

    }


    public T last() throws Exception {
        if (isEmpty())
            throw new Exception("ArrayList Empty");

        return list[rear - 1];
    }


    public boolean contains(T target) {
        return (find(target) != NOT_FOUND);
    }


    private int find(T target) {
        int scan = 0;
        int result = NOT_FOUND;

        if (!isEmpty())
            while (result == NOT_FOUND && scan < rear)
                if (target.equals(list[scan]))
                    result = scan;
                else
                    scan++;

        return result;
    }


    public boolean isEmpty() {
        return (rear == 0);

    }

    public int size() {
        return rear;
    }

    public String toString() {
        String result = "";

        for (int scan = 0; scan < rear; scan++)
            result = result + list[scan] + "\n";

        return result;
    }


    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {
        int iteratorModCount;
        int current;

        public ArrayListIterator() {
            iteratorModCount = modCount;
            current = 0;
        }

        public boolean hasNext() throws ConcurrentModificationException {
            if (iteratorModCount != modCount)
                throw new ConcurrentModificationException();

            return (current < rear);
        }

        public T next() throws ConcurrentModificationException {
            if (!hasNext())
                throw new NoSuchElementException();

            current++;

            return list[current - 1];
        }

        public void remove() throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

    }
}
