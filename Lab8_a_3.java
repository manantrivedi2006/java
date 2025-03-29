interface Transport{
	public void deliver();
}
abstract class Animal{
public void display(){
		System.out.println("Inside Animal display method call.... ");
	}
}
class Tiger extends Animal{
public void display(){
		System.out.println("Inside Camel display method call.... ");
	}
}
class Camel extends Animal implements Transport{
	public void deliver(){
		System.out.println("Inside Camel deliver method call.... ");
	}
	public void display(){
		System.out.println("Inside Camel display method call.... ");
	}
}
class Deer extends Animal{
	public void display(){
		System.out.println("Inside Deer display method call.... ");
	}
}
class Donkey extends Animal implements Transport{
	public void deliver(){
		System.out.println("Inside Donkey deliver method call.... ");
	}
	public void display(){
		System.out.println("Inside Donkey display method call.... ");
	}
}
public class Lab8_a_3{
	public static void main(String [] args){
		Animal[] obj=new Animal[4];
			obj[0]=new Tiger();
				obj[1]=new Camel();
					obj[2]=new Deer();
						obj[3]=new Donkey();
		obj[0].display();
		((Transport)obj[1]).deliver();
		obj[1].display();
		obj[2].display();
		((Transport)obj[3]).deliver();				
		obj[3].display();				
	}
}