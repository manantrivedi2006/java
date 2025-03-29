import java.util.Scanner;
public class Lab10_a_1{
	public static void main(String [] args){
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter nuber of student");
		int n=sc.nextInt();
		
		try{
			int total=0;
			int a[]=new int[5];
			for(int i=0;i<n;i++){
			 total+=a[i];

			}
			int avg=total/n;
		
		}
		catch (ArithmeticException e){
			System.err.println("this is ArithmeticException");
		}
		catch (ArrayIndexOutOfBoundsException ae){
			System.err.println("this is ArrayIndexOutOfBoundsException");
		}
	}
}