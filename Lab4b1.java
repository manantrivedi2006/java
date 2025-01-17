import java.util.Scanner;
public class Lab4b1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A line");
		String str = sc.nextLine();
	
		System.out.println("Size of string is : "+str.length());
		for(int i=str.length()/2;i<str.length();i++){
			char ch =str.charAt(i);
			if(ch == ' '){
				continue;
			}
			System.out.print(ch);
		}
 	}
}