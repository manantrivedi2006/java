import java.util.Scanner;
public class Lab5b6{
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a size :");
	int n=sc.nextInt();
	int k=2*n-1;
	for (int i=0; i<n;i++ ) {
	for (int j=0;j<k ;j++ ) {
			System.out.print(" ");
		}	

			k=k-1;
			for (int j=0;j<=i ;j++ ) {
				System.out.print("* ");
			}
			System.out.println(" ");
	}
	
	for (int i=0; i<n;i++ ) {
	for (int j=k+2;j>0 ;j-- ) {
			System.out.print(" ");
		}	

			k=k+1;
			for (int j=n-1;j>i ;j-- ) {
				System.out.print("* ");
			}
			System.out.println(" ");
	}
}
}