import java.util.Scanner;
class cubeofobject{
	float height;
	float width;
	float depth;
	public float calArea(float height,float width,float depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
		return this.height*this.width*this.depth;
			}
}
public class Cube{
	public static void main(String [] args)
	{
		float area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter heigth");
		float h1=sc.nextFloat();
		System.out.println("enter width");
		float w1=sc.nextFloat();
		System.out.println("enter depth");
		float d1=sc.nextFloat();
		cubeofobject c1=new cubeofobject();
		area=c1.calArea(h1,w1,d1);
		System.out.println("area="+area);
	}
}