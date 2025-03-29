interface Shape{
	public void getArea();
}
// three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
class Rectangle implements Shape{
public void getArea(){
System.out.println("this is Rectangle");
}
}
class Circle implements Shape{
public void getArea(){
System.out.println("this is Circle");
}
}
class Triangle implements Shape{
	public void getArea(){
System.out.println("this is Triangle");
}
}
public class Lab9_b_5{
	public static void main(String [] args){
		Circle c1=new Circle();
		c1.getArea();
			Triangle t1=new Triangle();
		t1.getArea();
			Rectangle r1=new Rectangle();
		r1.getArea();
	}
}