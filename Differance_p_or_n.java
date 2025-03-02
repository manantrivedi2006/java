import java.util.Scanner;
public class Differance_p_or_n{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		int c=a-b;
		if(c>0){
			System.out.println("differance is positive");
		}
		else{
			System.out.println("differance is nagative");
		}

	}
} 