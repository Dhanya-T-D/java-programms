import java.util.*;
public class Binarysearch {
    public static void main(String[] args){
        int a[]=new int[5];
        int temp,n,i,j;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the elements");
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }


        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("sorted array :");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
//-------sorting completed----------------------------------

        System.out.println("enter the target");
        int tar=sc.nextInt();
        int low=0;
        int high=a.length-1;
        int ret=binarysearch(tar,a,low,high);

        if(ret<0){
            System.out.println("Element is not present");
        }

        else{
            System.out.println("element is present at "+ret);
        }

    }


    private static int binarysearch(int tar,int[] a,int low, int high) {
        int mid = (low + high) / 2;
        if (high > low) {
            return -1;
        }
        if (a[mid] == tar) {
            return mid;
        } else if (a[mid] < tar) {

            return binarysearch(tar,a,low,mid-1);

        } else if(a[mid]>tar) {
            return binarysearch(tar,a,mid+1,high);
        }

        return -1;
    }

}
