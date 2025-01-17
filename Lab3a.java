import java.util.Scanner;
public class Lab3a
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of sub1");
		int sub1=sc.nextInt();
		System.out.println("enter the marks of sub2");
		int sub2=sc.nextInt();
		System.out.println("enter the marks of sub3");
		int sub3=sc.nextInt();
		System.out.println("enter the marks of sub4");
		int sub4=sc.nextInt();
		System.out.println("enter the marks of sub5");
		int sub5=sc.nextInt();
		int sum=sub1+sub2+sub3+sub4+sub5;
		float per=(float)(sum*100)/500;
		System.out.println("your per ="+per);
		if (per>=60) {
			System.out.println("first division");
		}
else if (per>=50 && per<=59) {
	System.out.println("second division");
}
else if (per>=40 && per<=49) {
	System.out.println("third division");
}	
else{
	System.out.println("fail");
	}
}
}