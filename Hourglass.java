import java.util.*;
public class Hourglass{
	public static void main(String[] args){

		int i,j,r,c;


		Scanner sc=new Scanner(System.in);

		System.out.println("\nNOTE : ROW & COLUMN MUST BE ODD NUMBERS\n");

		System.out.println("Enter no of Rows");
		r=sc.nextInt();
		System.out.println("Enter no of Columns");
		c=sc.nextInt();
		int[][] a= new int[r][c];


		System.out.println("Enter array elements");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		
		
		System.out.println("\nHourglass array");
		System.out.println("-----------------\n");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
	

				 if ((i<r/2 && j==0)||(i<r/2 && j==c-1) || (i>r/2 && j==0) || (i>r/2 && j==c-1))	
					{System.out.print(a[i][j]);
					System.out.print("\t");
					}	
				 else 	if((i==r/2) && (j==c/2)){
					System.out.println(a[i][j]);
				        }
				else
					System.out.print("\t");
			}

			System.out.println();
		}
	

	}
}