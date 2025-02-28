class Complex{
	int real;
	int img;
	
	public Complex(int real,int img){
		this.real=real;
		this.img=img;
		
	}
	public void add(Complex c2){
		this.real=this.real+c2.real;
		this.img=this.img+c2.img;
		System.out.println(this.real+"+"+this.img+"i");
	}
}
public class Lab6b5{
	public static void main(String[]args){
		Complex c1=new Complex(4,5);
		Complex c2=new Complex(5,4);
		c1.add(c2);
		
	}
}