class Demo extends Thread{
    public void run() {
        while(true){
            int a=(int)(Math.random()*100);
            System.out.println(a);
           if(a%2==0){
            Demo1 d1=new Demo1(a);
            d1.start();
           }
           else{
            Demo2 d2=new Demo2(a);
            d2.start();
           }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Demo1 extends Thread{
int ans1;
public Demo1(int a){
     this.ans1=a*a;
}
public void run(){
    System.out.println("Square is="+this.ans1);
}
}
class Demo2 extends Thread{
int ans2;
public Demo2(int a){
    this.ans2=a*a*a;
}
public void run(){
    System.out.println("Cube is="+this.ans2);
}
}
public class Lab11_b_5 {
  public static void main(String[] args) {
    Thread t1=new Thread(new Demo());
    t1.start();
  }
}