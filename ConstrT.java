public class ConstrT{
	public static void main(String[] args){
		Const1 a = new Const1(999);
	/* Constr2 b = new Constr2("gorg ", 7);
		a.gogo();
		b.gogo();
	
	*/
	
	
	Const1 [] array = {a, a, a, a};
	System.out.println("have " +array[0].getApriv());

	array[2].setApriv(54);
	System.out.println("have " +array[0].getApriv());

		
	
	}
	
}