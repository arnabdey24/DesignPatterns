package adapter;

public class Client {

    public static void main(String[] args) throws Exception {

        Queue<Integer> queue=new ListQueue<>();

        queue.enqueue(9);
        queue.enqueue(8);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(5);

        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
