public class TestBoats{
	static public void main(String[] args){
		Boat b1 = new Boat1();
		Saliboat b2 = new Saliboat();
		Rowboat b3 = new Rowboat();
		Boat1 q = new Saliboat();
		Saliboat k = (Saliboat) q;
		
		Boat1 r = new Dboat();
		//Saliboat r1 = (Saliboat) r;
		
		
		b3.move(9);
		
		
		System.out.println(b3.getLength());
		
	/*	Dboat a = new Dboat();
		a.move(5);
		a.dying();
		
		Machine l = new Dboat();
		l.breaking();
		
		
		
		if (r instanceof Saliboat)
			System.out.println("hgfsuihjxhvkjdgvjdgvjdgu \n");
		
		b2.setLength(32);
		b1.move(1);
		b3.move(1);
		b2.breaking();
		r1.breaking();
		System.out.println(b2.getLength());*/
		
	}
	
} 