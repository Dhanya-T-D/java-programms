import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedl {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 colors : ");
        for(int i=0;i<4;i++){
            color.add(sc.next());
        }
        System.out.println(color);

        System.out.println("\nadd first");
        color.addFirst("pacha");

        System.out.println("\nadd last");
        color.addLast("orange");

        System.out.println("\ncolor is : "+color.get(2));
        System.out.println(color);

        System.out.println("\nget first");
        System.out.println(color.getFirst());

        System.out.println("\n get last");
        System.out.println(color.getLast());



        System.out.println("\nchange color at index 2 : "+color.set(2,"purple"));
        System.out.println(color);

        String r = color.remove(3);
        System.out.println("\ncolor removed :"+r);
        System.out.println(color);

        System.out.println("\n remove first");
        color.removeFirst();
        System.out.println(color);

        System.out.println("\remove last");
        color.removeLast();
        System.out.println(color);

        System.out.println("\ncolor contains");
        System.out.println("enter color to check : ");
        String s = sc.next();
        System.out.println("\ncolor contains :"+color.contains(s));

        System.out.println("\ncheck index of color ");
        System.out.println("enter a color to find index : ");
        String i = sc.next();
        System.out.println(color.indexOf(i));

        System.out.println("\nprint using iterator : ");
        Iterator<String> iter = color.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\nclear");
        color.clear();
        System.out.println(color);

        System.out.println("\noffer");
        color.offer("green");
        color.offer("violet");
        System.out.println(color);


        System.out.println("\npeek");
        System.out.println(color.peek());

        System.out.println("\npoll");
        System.out.println(color.poll());

        System.out.println(color);


    }
}
