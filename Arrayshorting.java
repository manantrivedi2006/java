import java.util.*;
public class Arrayshorting{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array n :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter a numbers");
				 arr[i]=sc.nextInt();			 
		}
		System.out.println("arry without short :"+Arrays.toString(arr));
	for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-i-1;j++){
			
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("arry with short :"+Arrays.toString(arr));
}
}