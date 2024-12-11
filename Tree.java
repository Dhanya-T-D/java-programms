import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        System.out.println("tree : "+t);
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.addAll(t);
        System.out.println("tree1 : "+t1);

        t1.remove(1);
        System.out.println("tree1 : "+t1);

        t1.removeAll(t1);
        System.out.println("tree1 : "+t1);

        Iterator<Integer> ite = t.iterator();
        System.out.println("iterator :");
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println("first :"+t.first());
        System.out.println("last :"+t.last());
        System.out.println("higher : "+t.higher(2));
        System.out.println("lower : "+t.lower(5));
        System.out.println("ceiling : "+t.ceiling(0));
    }
}
