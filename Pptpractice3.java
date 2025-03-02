class Student{
	int id_no;
	int no_of_subject;
	int subject_code;
	int subject_credites;
	char grade_obtained;
	double spi;
	Student(){
	this.id_no=id_no;
	this.no_of_subject=no_of_subject;
	this.subject_code=subject_code;
	this.subject_credites=subject_credites;
	this.grade_obtained=grade_obtained;
	this.spi=spi;
	
	}
}
public class Pptpractice3{
	public static void main(String [] args){
		Student s1=new Student();
		s1.id_no=111;
		s1.no_of_subject=5;
		s1.subject_code=12345;
		s1.subject_credites=6;
		s1.grade_obtained='a';
		s1.spi=7.81;
		System.out.println("s1.id_no :"+s1.id_no);
		System.out.println("s1.no_of_subject :"+s1.no_of_subject);
		System.out.println("s1.subject_code :"+s1.subject_code);
		System.out.println("s1.subject_credites :"+s1.subject_credites);
		System.out.println("s1.grade_obtained :"+s1.grade_obtained);
		System.out.println("s1.spi :"+s1.spi);
	}
}