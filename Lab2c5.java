import java.util.Scanner;
public class Lab2c5{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		double a=sc.nextDouble();
		System.out.println("enter the second number");
		double b=sc.nextDouble();
		System.out.println("enter the third number");
		double c=sc.nextDouble();
		if(a>b){
			if(a>c){
				System.out.println(a+"is largest");
			}
			else{
				System.out.println(c+"is  largest");
			}

		}
		else if(b>a){
			if(b>c){
				System.out.println(b+"is largest");
			}
			else{
				System.out.println(c+"is  largest");
			}
		}
	else if(c>a){
			if(c>b){
				System.out.println(c+"is largest");
			}
			else{
				System.out.println(b+"is  largest");
			}}
	}
}