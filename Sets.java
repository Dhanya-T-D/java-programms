import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 elements : ");
        for (int i = 0; i < 4; i++) {
            s.add(sc.next());
        }
        Iterator<String> ite = s.iterator();
        System.out.println("set");
        ite.forEachRemaining((value)-> System.out.println(value+" "));

        Set<String> s1 = new HashSet<>();
        s1.addAll(s);
        System.out.println("add all to s1 : "+s1);

        s1.remove("a");
        System.out.println("one item removed : "+s1);

        s1.removeAll(s1);
        System.out.println("remove all : "+s1);
    }
}
