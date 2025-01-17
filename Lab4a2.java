import java.util.Scanner;
public class Lab4a2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size of array n :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter a numbers");
				 arr[i]=sc.nextInt();
				 sum=sum+arr[i];
		}
			float avg=(float)sum/(n);
			System.out.println("avg of numbers is ="+avg);

	}
}