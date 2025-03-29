import java.util.Scanner;
class Book{
	private String a_n;
	Book(String a_n){
		this.a_n=a_n;
		
	}
	void display(){
			System.out.println(this.a_n);
		}
}
class Book_pub extends Book{
	private String title;
	Book_pub(String a_n,String title){
		super(a_n);
		this.title=title;
	}
	void display(){
			super.display();
			System.out.println(this.title);
		}

}
class Paper_pub extends Book{
		private String title;
	Paper_pub(String a_n,String title){
		super(a_n);
		this.title=title;
	}
	void display(){
			super.display();
			System.out.println(this.title);
		}

}
class Lab7_a_2{
	public static void main(String [] args){
		Book b1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter publication");
		String pub=sc.nextLine();
		if(pub.equals("Book")){
			Book_pub bp=new Book_pub("manan","abc");
			bp.display();

		}
		else if(pub.equals("paper")){
			Paper_pub pb=new Paper_pub("manan","xyz");
			pb.display();
		}
	}
}