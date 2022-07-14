abstract public class Boat{
	private int length;
	
	public void setLength(int len){
		length = len;
	}
	
	public int getLength(){
		return length;
	}
	
	abstract public void move(int i);
	
	public Boat(){
		System.out.println("OOOOOOOOOOOOO");
	}
	
}