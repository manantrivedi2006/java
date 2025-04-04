class Demo implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2!=0){
				System.out.println("odd no="+i);
			}
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
		for(int i=1;i<=20;i++){
			if(i%2==0){
				System.out.println("even no="+i);
			}
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
					e.printStackTrace();
			}
		}
	}
}
public class Lab11_b_4{
	public static void main(String [] args){
		Thread t1=new Thread(new Demo());
		t1.start();
		Thread t2=new Thread(new Demo2());
		t2.start();
	}
}