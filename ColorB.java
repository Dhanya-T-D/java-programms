import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColorB {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers : ");
        for (int i = 0; i <= 6 ; i++) {
            number.add(sc.nextInt());
        }
        System.out.println("\nsorting....");
        number.sort(Comparator.naturalOrder());
        System.out.println(number);


        for (int a : number){
            System.out.println(a);
        }


        System.out.println("\nenter number at 0th : ");
        number.set(0,sc.nextInt());
        System.out.println(number);

        System.out.println("\nnumber at 4th : "+number.get(4));

        System.out.println("\nupdate number : ");
        System.out.println("enter index to update : ");
        int c = sc.nextInt();

        number.set(c,69);
        System.out.println(number);

        int elm = number.remove(2);
        System.out.println("\nthird element removed : "+elm);

        System.out.println(number);
        System.out.println("\nnumber contain : "+number.contains(69));

        System.out.println("\narray size "+ number.size());

        System.out.println("\narray empty or not");
        System.out.println("array empty "+ number.isEmpty());

        System.out.println("\ncheck index");
        System.out.println(number);
        System.out.println("index of 10  "+ number.indexOf(10));
        System.out.println("index of 20  "+ number.indexOf(20));

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.addAll(number);
        System.out.println("copied");
        System.out.println(number1);
    }
}

