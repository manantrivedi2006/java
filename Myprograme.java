class person{
	int age;
	String name;
	public void personname(){
		System.out.println("name="+name);
	}
	public void personage(){
		System.out.println("age="+age);
	}
}
public class Myprograme{
	public static void main(String [] args){
		person p1=new person();
		person p2=new person();
		p1.age=20;
		p1.name="manan";
		p2.age=30;
		p2.name="vatsal";
		p1.personname();
		p1.personage();
		p2.personname();
		p2.personage();
	}
}