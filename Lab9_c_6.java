interface Playable{
	public void play();
}
class Football implements Playable{
	public void play(){
		System.out.println("this is Football");
	}
}
class Volleyball implements Playable{
	public void play(){
		System.out.println("this is volleyball");
	}
}
class Basketball implements Playable{
public void play(){
		System.out.println("this is Basketball");
	}
}
public class Lab9_c_6{
	public static void main(String[]args){
		Football f1=new Football();
		f1.play();
		Volleyball v1=new Volleyball();
		v1.play();
		Basketball b1=new Basketball();
		b1.play();
	}
}