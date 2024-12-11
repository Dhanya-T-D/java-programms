import java.net.SocketOption;
import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args){
        ArrayList a= new ArrayList<String>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add("hello");
        System.out.println(a);
        ArrayList b=new ArrayList<String>();
        b.addAll(a); // add all elements of a to b
        System.out.println(b);
        System.out.println(a.size()); // to find size of list object
        //a.clear(); clear all elemnts of a
        System.out.println(a.isEmpty());
        ArrayList c=new ArrayList<String>();
        c=(ArrayList) a.clone();
        System.out.println(c);

    }
}
