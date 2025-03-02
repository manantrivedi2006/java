import java.util.Scanner;
public class Unit1ex1{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1:");
		double a=sc.nextDouble();
			System.out.println("enter the number2:");
		double b=sc.nextDouble();
			System.out.println("enter the number3:");
		double c=sc.nextDouble();
			System.out.println("enter the number4:");
		double d=sc.nextDouble();
			System.out.println("enter the number5:");
		double e=sc.nextDouble();
		System.out.println("if you want to smallest then press 1");
		System.out.println("if you want to largest then press 2");
		System.out.println("if you want to sum then press 3");
		System.out.println("if you want to avg then press 4");
		System.out.println("what you want?");
		int q=sc.nextInt();
		switch(q){
		case 1:
			if(a>b && a>c && a>d && a>e){
				System.out.println(a+" is largest");}
			else if(b>a && b>c && b>d && b>e){
				System.out.println(b+" is largest");}
			else if(c>a && c>b && c>d && c>e){
				System.out.println(c+" is largest");}
				else if(d>a && d>b && d>c && d>e){
				System.out.println(d+" is largest");}
				else if(e>a && e>b && e>d && e>c){
				System.out.println(e+" is largest");}
				break;
			case 2:
			if(a<b && a<c && a<d && a<e){
				System.out.println(a+" is smallest");}
			else if(b<a && b<c && b<d && b<e){
				System.out.println(b+" is smallest");}
			else if(c<a && c<b && c<d && c<e){
				System.out.println(c+" is smallest");}
				else if(d<a && d<b && d<c && d<e){
				System.out.println(d+" is smallest");}
				else if(e<a && e<b && e<d && e<c){
				System.out.println(e+" is smallest");}
				break;
			case 3:
				System.out.println("ans is ="+(a+b+c+d+e));
				break;
			case 4:
				System.out.println("ans is ="+((a+b+c+d+e)/5));
				break;
			default:System.out.println("invalid input");
			}
		}

	}
