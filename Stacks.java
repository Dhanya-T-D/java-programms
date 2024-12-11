import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        s.push("e");
        s.push("f");
        s.push("g");
        s.push("h");
        System.out.println("\nstack elements");

        
        System.out.println(s);


        Iterator<String> ite = s.iterator();

        System.out.println("has_next : "+ite.hasNext());
        System.out.println("next : " +ite.next());
        ite.remove();
        System.out.println(s);

        System.out.println("next : " +ite.next());
        ite.remove();
        System.out.println(s);

        System.out.println("for each");
        ite.forEachRemaining((value)-> System.out.println(value+" "));

//        String a = s.pop();
//        System.out.println("stack element deleted : "+a);
//        a = s.pop();
//        System.out.println("stack element deleted : "+a);
//        System.out.println("after delete");
//        System.out.println(s);
//
//        System.out.println("\npeek : "+s.peek());
//        System.out.println("\nsearch");
//        System.out.println("\nfound at index : "+s.search("b"));
//
//        System.out.println("\nempty");
//        System.out.println("\nis empty : "+s.empty());


    }
}
