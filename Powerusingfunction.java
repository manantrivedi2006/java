import java.util.*;

public class Powerusingfunction{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number :");
		int n=sc.nextInt();
		System.out.println("Enter power :");
		int p=sc.nextInt();
		Powerusingfunction pmd=new Powerusingfunction();
	int	res=pmd.power(n,p);
		System.out.println("ans="+res);
	}
	int power(int a, int b){
		int i,r=1;
		for (i=1;i<=b ;i++ ) {
			r=r*a;
		}
		return r;
	}
} 