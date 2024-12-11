
import java.util.Scanner;

public class Linearsearch {

    public static void main(String[] args){
        int[] a =new int[20];
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        System.out.println("Enter the elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the element to find");
        int k=sc.nextInt();

        int result=searchmethod( a,k);

        if(result>=0){
            System.out.println("Element is present ");
        }
        else{
            System.out.println("not present");
        }

    }
    private static int searchmethod(int[] a, int k){
        for( int i=0;i<a.length;i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }
}
