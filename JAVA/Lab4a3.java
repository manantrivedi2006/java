import java.util.Scanner;
public class Lab4a3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array n :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter a numbers");
				 arr[i]=sc.nextInt();
				 
		}
			for(int i=n-1;i>=0;i--){
				System.out.println(arr[i]);

			}
			

	}
}