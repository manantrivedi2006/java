
import java.util.Scanner;
public class pptpractice2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the redius :");
		double r=sc.nextDouble();
		pptpractice2 c1=new pptpractice2();
	double	area=c1.area(r);
		System.out.println("ans:"+area);
	}
	double area(double r){
	return 3.14*r*r;

	}
}