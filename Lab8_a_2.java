interface A{
public static final int c=10;
 public void PrintA();
}
interface A1 extends A{
public static final int d=11;
public void PrintA1();
}
interface A2 extends A{
	public static final int e=12;
public void PrintA2();
}
interface A12 extends A1,A2{
	public static final int f=13;
public void PrintA12();
}
class B implements A12{
public	void PrintA(){
	System.out.println("c="+c);
}
public void PrintA1(){
	System.out.println("d="+d);
}
public void PrintA2(){
	System.out.println("e="+e);
}
public void PrintA12(){
	System.out.println("f="+f);
}
}
public class Lab8_a_2{
	public static void main(String [] args){
		B b1=new B();
		b1.PrintA();
		b1.PrintA1();
		b1.PrintA2();
		b1.PrintA12();
	}
}