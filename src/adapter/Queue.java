package adapter;

public interface Queue<E> {

    void enqueue(E element);

    E dequeue() throws Exception;

    E peek() throws Exception;
}
