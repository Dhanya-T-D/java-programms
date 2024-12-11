import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter colours : ");
        for (int i = 0; i <= 6 ; i++) {
            color.add(sc.nextLine());
        }
        Iterator<String> itrate = color.iterator();
        while (itrate.hasNext()){
            System.out.println(itrate.next());
        }

//        System.out.println("\nsorting....");
//        color.sort(Comparator.naturalOrder());
//        System.out.println(color);
//
//
//        for (String a : color){
//            System.out.println(a);
//        }


//        System.out.println("\nenter colours at 0th : ");
//            color.set(0,sc.nextLine());
//        System.out.println(color);
//
//        System.out.println("\ncolours at 4th : "+color.get(4));
//
        System.out.println("\nupdate color : ");
        System.out.println("enter index to update : ");
        int c = sc.nextInt();

        color.set(c,"Pink");
        System.out.println(color);
//
//        String elm = color.remove(2);
//        System.out.println("\nthird element removed : "+elm);
//
//        System.out.println(color);
//        System.out.println("\ncolor contain : "+color.contains("pink"));
//
//        System.out.println("\narray size "+ color.size());
//
//        System.out.println("\narray empty or not");
//        System.out.println("array empty "+ color.isEmpty());
//
//        System.out.println("\ncheck index");
//        System.out.println(color);
//        System.out.println("index of pink  "+ color.indexOf("pink"));
//        System.out.println("index of brown  "+ color.indexOf("brown"));
//
//        ArrayList<String> color1 = new ArrayList<>();
//        color1.addAll(color);
//        System.out.println("copied");
//        System.out.println(color1);
    }
}
