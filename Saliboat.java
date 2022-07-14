public class Saliboat extends Boat1 implements Machine, Living{
	public void move(int i){
		System.out.println("podnyat parusa");
		
	}
	
	public void breaking(){
		System.out.println("Oops");
	}
	
	public void dying(){
		System.out.println("5die");
		
	}
	
	public Saliboat(){
		System.out.println("We CRAETE silly saly");
		
	}
}