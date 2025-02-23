import java.util.Scanner;
public class Lab6a3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int vow=0;
		while(true){
			System.out.println("enter the Line");
			String str=sc.next();
			if(str.equals("quit")){
				break;

			}
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
							vow++;
					}}
			
		}
		System.out.println("vowel="+vow);
	}
	}