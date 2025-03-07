import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subject;
	String[] sub_code;
	int[] sub_credit;
	String[] grade_obtained;
	double spi;
	public Student(int id_no,int no_of_subject,String[] sub_code,int[] sub_credit,String[] grade_obtained){
		this.id_no=id_no;
		this.no_of_subject=no_of_subject;
		this.sub_code=sub_code;
		this.sub_credit=sub_credit;
		this.grade_obtained=grade_obtained;

	}
	public int grade_point(String g){
		if(g.equals("A++")){
			return 10;
		}
		else if(g.equals("A+")){
			return 9;
		}
		else if(g.equals("A")){
			return 8;
		}
		else if(g.equals("B")){
			return 7;
		}
		else if(g.equals("C")){
			return 6;
		}
		else if(g.equals("D")){
			return 5;
		}
		else if(g.equals("F")){
			return 0;
		}
		return -1;
	}
	public void spi(){
		int total_point=0,total_credit=0;
		for (int i=0;i<no_of_subject ;i++ ) {
			total_credit+=sub_credit[i];
			total_point+=sub_credit[i]*grade_point(grade_obtained[i]);
			 this.spi=total_point/total_credit;
			
		}
}
	}



public class Lab7a1{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sudent details");
		System.out.println("id_no");
		int a=sc.nextInt();
		System.out.println("enter no_of_subject");
		int b=sc.nextInt();
		

		String [] c=new String[b];
		
		int [] d=new int[b];
		
	String [] e=new String[b];
		for (int i=0;i<b;i++ ) {
			System.out.println("enter sub_code");
			c[i]=sc.next();
						System.out.println("enter sub_credit");
			d[i]=sc.nextInt();
						System.out.println("enter grade_obtained");
			e[i]=sc.next();
		}
		Student s1=new Student(a,b,c,d,e);
		s1.spi();
		System.out.println(s1.spi);

	}
}