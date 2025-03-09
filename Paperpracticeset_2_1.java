import java.util.Scanner;
public class Paperpracticeset_2_1{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n :");
		int n=sc.nextInt();
		int firstterm=0;
		int secondterm=1;
		int nextterm;
		for (int i=1;i<=n ;i++) {
			System.out.print(firstterm+" ");
			nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
	}
}