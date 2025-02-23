import java.util.Scanner;
class RectangleArea{
	double height;
	double width;
	public void Area(){
	double area=height*width;
	System.out.println("area="+area);
	}
}
public class Rectangle{
	public static void main(String []args){
		RectangleArea s1=new RectangleArea();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter heigth");
		double h1=sc.nextDouble();
		System.out.println("enter width");
		double w1=sc.nextDouble();
		s1.height=h1;
		s1.width=w1;
		s1.Area();

	}
}