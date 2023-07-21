import java.util.Stack;

public class QueUsing2staks<T> {
    private Stack<T> insertionstack;
    private Stack<T> deletionstack;

    public QueUsing2staks() {
        insertionstack = new Stack<>();
        deletionstack = new Stack<>();
    }

    public void Enque(T item) {
        insertionstack.push(item);
    }

    public T deque() {
        while (!insertionstack.isEmpty()) {
            deletionstack.push(insertionstack.pop());
        }

        return deletionstack.pop();
    }

    public T peek() {
        if (deletionstack.isEmpty()) {
            while (!insertionstack.isEmpty()) {
                deletionstack.push(insertionstack.pop());
            }
        }
        return deletionstack.peek();
    }

    public static void main(String[] args) {
        QueUsing2staks<Integer> queue = new QueUsing2staks<>();
        queue.Enque(10);
        queue.Enque(20);
        queue.Enque(30);
        queue.Enque(40);
        System.out.println(queue.deque());
        System.out.println(queue.deque());

    }
}
