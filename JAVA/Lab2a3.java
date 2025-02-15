import java.util.Scanner;
public class Lab2a3{
	public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("enter l :");
	Double l=sc.nextDouble();
	System.out.println("enter b :");
	Double b=sc.nextDouble();

	
	
	if(l<0 || b<0){
		System.out.println("Area is not found");
	}
	else{
		System.out.println("area= "+(l*b));
	}
	}
}