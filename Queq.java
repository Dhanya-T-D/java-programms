import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queq {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("a");
        q.add("b");
        q.add("c");
        System.out.println("queue elements");
        System.out.println(q);

        System.out.println("\n offer ");
        q.offer("d");
        System.out.println(q);

        System.out.println("\npeek");
        System.out.println(q.peek());

        Deque<String> qu = new LinkedList<>();
        qu.add("a");
        qu.addFirst("b");
        qu.addLast("c");
        System.out.println("dequeue elements");
        System.out.println(qu);

        System.out.println("\n offer ");
        qu.offer("d");
        System.out.println(qu);

        System.out.println("\npeek");
        System.out.println(qu.peek());


    }
}
