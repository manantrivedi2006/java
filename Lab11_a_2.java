class Demo implements Runnable{
	public void run(){
		while(true){
			System.out.println("good morning");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
					e.printStackTrace();
			}
		}
	}}
	class Demo2 implements Runnable{
	public void run(){
		while(true){
			System.out.println("good afternoon");
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
					e.printStackTrace();
			}
		}
	}
}
public class Lab11_a_2{
	public static void main(String [] args){
		Thread t1=new Thread(new Demo());
		t1.start();
		Thread t2=new Thread(new Demo2());
		t2.start();
	}
}