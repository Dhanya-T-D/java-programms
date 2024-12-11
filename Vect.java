import java.util.Vector;

public class Vect {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        System.out.println(v);
        v.set(2,"ab");
        System.out.println(v);
        System.out.println(v.get(1));
        System.out.println(v.size());

        System.out.println("contains :");
        System.out.println(v.contains("a"));

    }
}
