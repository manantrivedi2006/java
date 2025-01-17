import java.util.Scanner;
public class Lab3a4{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number a:");
		int a=sc.nextInt();
		System.out.println("enter the number b:");
		int b=sc.nextInt();
		System.out.println("enter the number c:");
		int c=sc.nextInt();
		(a>b)?((a>c)?(System.out.println("maximum number is "+a)):(System.out.println("maximum number is "+c))):((b>c)?(System.out.println("maximum number is "+b)):(System.out.println("maximum number is "+c)));
	}
}