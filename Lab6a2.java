class Time{
	int hour;
	int min;
	public Time(int hour,int min){
		this.hour=hour;
		this.min=min;
	}
	public void add(Time t2){
		this.hour+=t2.hour;
		this.min+=t2.min;
		if(this.min>=60){
			this.hour++;
			this.min=this.min-60;
		}
		System.out.println(this.hour+":"+this.min);
	}

}
public class Lab6a2{
	public static void main(String[]args){
		Time t1=new Time(8,30);
		Time t2=new Time(3,30);
		t1.add(t2);

	}
	}