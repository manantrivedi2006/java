import java.util.Scanner;
public class Paperpracticeset_2_3{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	System.out.println("enter a letter :");
	String str=sc.next();
int arr[]=new int[26];
		for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				 if ( ch=='a') {
					arr[0]++;
				}
				else if(ch=='b'){
					arr[1]++;
				}
				else if(ch=='c'){
					arr[2]++;
				}
				else if(ch=='d'){
					arr[3]++;
				}
				else if(ch=='e'){
					arr[4]++;
				}
				else if(ch=='f'){
					arr[5]++;
				}
				else if(ch=='g'){
					arr[6]++;
				}
				else if(ch=='h'){
					arr[7]++;
				}
				else if(ch=='i'){
					arr[8]++;
				}
				else if(ch=='j'){
					arr[9]++;
				}
				else if(ch=='k'){
					arr[10]++;
				}
				else if(ch=='l'){
					arr[11]++;
				}
				else if(ch=='m'){
					arr[12]++;
				}
				else if(ch=='n'){
					arr[13]++;
				}
				else if(ch=='o'){
					arr[14]++;
				}
				else if(ch=='p'){
					arr[15]++;
				}
				else if(ch=='q'){
					arr[16]++;
				}
				else if(ch=='r'){
					arr[17]++;
				}
				else if(ch=='s'){
					arr[18]++;
				}
				else if(ch=='t'){
					arr[19]++;
				}
				else if(ch=='u'){
					arr[20]++;
				}
				else if(ch=='v'){
					arr[21]++;
				}
				else if(ch=='w'){
					arr[22]++;
				}
				else if(ch=='x'){
					arr[23]++;
				}
				else if(ch=='y'){
					arr[24]++;
				}
				else if(ch=='z'){
					arr[25]++;
				}
			}
			if(arr[0]!=0){
				System.out.println("a is="+arr[0]);
			}
			if(arr[1]!=0){
				System.out.println("b is="+arr[1]);
			}
			if(arr[2]!=0){
				System.out.println("c is="+arr[2]);
			}
			if(arr[3]!=0){
				System.out.println("d is="+arr[3]);
			}
			if(arr[4]!=0){
				System.out.println("e is="+arr[4]);
			}
			if(arr[5]!=0){
				System.out.println("f is="+arr[5]);
			}
			if(arr[6]!=0){
				System.out.println("g is="+arr[6]);
			}
			if(arr[7]!=0){
				System.out.println("h is="+arr[7]);
			}
			if(arr[8]!=0){
				System.out.println("i is="+arr[8]);
			}
			if(arr[9]!=0){
				System.out.println("j is="+arr[9]);
			}
			if(arr[10]!=0){
				System.out.println("k is="+arr[10]);
			}
			if(arr[11]!=0){
				System.out.println("l is="+arr[11]);
			}
			if(arr[12]!=0){
				System.out.println("m is="+arr[12]);
			}
			if(arr[13]!=0){
				System.out.println("n is="+arr[13]);
			}
			if(arr[14]!=0){
				System.out.println("o is="+arr[14]);
			}
			if(arr[15]!=0){
				System.out.println("p is="+arr[15]);
			}
			if(arr[16]!=0){
				System.out.println("q is="+arr[16]);
			}
			if(arr[17]!=0){
				System.out.println("r is="+arr[17]);
			}
			if(arr[18]!=0){
				System.out.println("s is="+arr[18]);
			}
			if(arr[19]!=0){
				System.out.println("t is="+arr[19]);
			}
			if(arr[20]!=0){
				System.out.println("u is="+arr[20]);
			}
			if(arr[21]!=0){
				System.out.println("v is="+arr[21]);
			}
			if(arr[22]!=0){
				System.out.println("w is="+arr[22]);
			}
			if(arr[23]!=0){
				System.out.println("x is="+arr[23]);
			}
			if(arr[24]!=0){
				System.out.println("y is="+arr[24]);
			}
			if(arr[25]!=0){
				System.out.println("z is="+arr[25]);
			}
	}
}