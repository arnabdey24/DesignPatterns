package adapter;

public class ListQueue<E> implements Queue<E> {

    private ArrayList<E> arrayList;

    public ListQueue() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void enqueue(E element) {
        arrayList.addToRear(element);
    }

    @Override
    public E dequeue() throws Exception {
        return arrayList.removeFirst();
    }

    @Override
    public E peek() throws Exception {
        return arrayList.first();
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
