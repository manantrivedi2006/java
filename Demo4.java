import java.util.Scanner;
public class Demo4
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter meter ");
		
		int a=sc.nextInt();
		System.out.println(a*3.28);
		System.out.println("enter foot");
		int b=sc.nextInt();
		System.out.println(b*0.3048);

	}
}
