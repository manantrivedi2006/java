interface EventListener{
public void	performEvent();
}
interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
	// public void	performEvent();
}
interface KeyListener extends EventListener{
	public void keyPressed();
	public void keyReleased(); 
	// public void	performEvent();
}
class EventDemo implements MouseListener,KeyListener{
	public void	performEvent(){
			System.out.println("method performEvent");
	}
public void mouseClicked(){
			System.out.println("method mouseClicked");
		}
	public void mousePressed(){
		System.out.println("method mousePressed");
	}
	public void mouseReleased(){
		System.out.println("method mouseReleased");
	}
	public void mouseMoved(){
		System.out.println("method mouseMoved");
	}
	public void mouseDragged(){
		System.out.println("method mouseDragged");
	}
	public void keyPressed(){
		System.out.println("method keyPressed");
	}
	public void keyReleased(){
		System.out.println("method keyReleased");
	}
	}

public class Lab9_a_4{
	public static void main(String [] args){
		EventDemo d1=new EventDemo();
		d1.mouseClicked();
		d1.mouseDragged();
		d1.mousePressed();
		d1.mouseReleased();
		d1.mouseMoved();
		d1.keyPressed();
		d1.keyReleased();
		d1.performEvent();
}
}
