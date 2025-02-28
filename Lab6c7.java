
		class Count{
	static int count=0;
public	Count(){
		this.count++;
	}
	static void Count1(){
		this.count++;
	}
}

public class Lab6c7{
	public static void main(String []args){
		Count c1=new Count();
		Count c2=new Count();
		System.out.println(Count.count);
	}
}