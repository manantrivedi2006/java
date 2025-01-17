import java.util.Scanner;
public class Lab3a5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n:");
		int n=sc.nextInt();
		int count=0;
		int i=2;
		for (i=2;i<n;i++){
			if(n%i==0){
				count=count+1;
				break;
			}

		}
		if(count==0){
			System.out.println("n is prime");
		}
		else{
			System.out.println("n is not prime");
		}

			}
}
