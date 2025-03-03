import java.util.Scanner;
public class Lab3c8{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int a=sc.nextInt();
			System.out.println("Enter number 2 :");
		int b=sc.nextInt();
		Lab3c8 p=new Lab3c8();
		for (int i=a;i<=b ;i++ ) {
			p.printans(i);
		}
	}
	public void printans(int n){
		int count=0;
		for (int i=1;i<=n ;i++ ) {
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(n+" : is prime");
		}
	}
}