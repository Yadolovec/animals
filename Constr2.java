public class Constr2 extends Const1{
	String str;
	public Constr2(int y){
		super(y);
		System.out.println("This is from second class");
		
	}
	
	public Constr2 (String str, int y){
		this(y);
		this.str=str;
		System.out.println(str+" yuuuhuuuu");
		
	}
	
}