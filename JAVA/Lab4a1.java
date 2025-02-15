import java.util.Scanner;
public class Lab4a1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line :");
		String str=sc.nextLine();
		int con=0,vow=0;
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
							vow++;
					}
					else if(ch==' '){
						
					}
					else{
						con++;
					}
			}
				System.out.println("in this line number of vowels ="+vow);
				System.out.println("in this line number of consonants ="+con);
	}
}