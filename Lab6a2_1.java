class Time{
	int hour;
	int min;
	public Time(int hour,int min){
		this.hour+=hour;
		this.min+=min;
		
	}
	public void add(int hour,int min){
		this.hour+=hour;
		this.min+=min;
		if(this.min>=60){
			this.hour++;
			this.min=this.min-60;}
		System.out.println(this.hour+":"+this.min);
		}
		
}
public class Lab6a2_1{
	public static void main(String []args){
		Time t1=new Time(2,30);
		Time t2=new Time(2,30);
		t1.add(2,30);
	}
}