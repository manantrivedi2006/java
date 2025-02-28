class Count{
	static int count=0;
public	Count(){
		count++;
	}
}

public class Lab6b6{
	public static void main(String []args){
		Count c1=new Count();
		Count c2=new Count();
		System.out.println(Count.count);

		
	}
}