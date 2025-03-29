import java.util.Scanner;
class Member{
	String name;
	int age;
	String number;
	String address;
	double salary;
	Member(String name,int age,String number,String address,double salary){
this.name=name;
	this.age=age;
	this.number=number;
	this.address=address;
	this.salary=salary;
	}
	void display(){
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.number);
		System.out.println(this.address);
		System.out.println(this.salary);
	}
}
class Employee extends Member{
	String spcialisation;
	String department;
	Employee(String name,int age,String number,String address,double salary,String spcialisation,String department){
		super(name,age,number,address,salary);
		this.department=department;
		this.spcialisation=spcialisation;
		void display(){
			super.display();
			System.out.println(this.spcialisation);
			System.out.println(this.department);

		}
	}
}
class Manager extends Member{
	String spcialisation;
	String department;
	Employee(String name,int age,String number,String address,double salary,String spcialisation,String department){
		super(name,age,number,address,salary);
		this.department=department;
		this.spcialisation=spcialisation;
		void display(){
			super.display();
			System.out.println(this.spcialisation);
			System.out.println(this.department);

}
public class Lab7_3{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter post");
		String pos=sc.nextLine();
		if(pos.equals("emplyee")){
			Employee em=new Employee("manan",18,"124","abc",1000,"devloper","cse");
			em.display();
		}
		else if(pos.equals("Manager")){
			Employee mg=new Employee("gojo",18,"124","abw",10000,"web devloper","cse");
			em.display();
		}
	}
}