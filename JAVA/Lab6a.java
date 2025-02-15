import java.util.Scanner;
class Circle{
	double r;

public void area(double r){
	this.r=r;
	double a=3.14*this.r*this.r;
	System.out.println(a);
}

}

class Lab6a{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Circle c1=new Circle();
		System.out.println("enter the r");
		double r=sc.nextDouble();
		c1.area(r);
	

	}
}