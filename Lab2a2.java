import java.util.Scanner;
public class Lab2a2{
	public static void main(String[]args){

Scanner sc=new Scanner(System.in);
	System.out.println("enter a: ");
	int a=sc.nextInt();
	System.out.println("enter b: ");
	int b=sc.nextInt();
	String str=sc.next();
	if (str.equals("+")) {
		System.out.println("ans= "+(a+b));
		
	}
 else if (str.equals("-")) {
		System.out.println("ans= "+(a-b));
		
	}
	else if (str.equals("*")) {
		System.out.println("ans= "+(a*b));
		
	}
	else if (str.equals("/")) {
		System.out.println("ans= "+(a/b));
		
	}
		else{
			System.out.println("invalid input");
		}
}
}