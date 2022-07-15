public class Const1{
	/*public Const1(){
		System.out.println("This is from first class ");
	}*/
	private int apriv;
	
	public Const1(int apriv){
		this.apriv = apriv;
		System.out.println("You have : "+apriv);
	}
	public void gogo(){
		System.out.println("gogo "+apriv);
	}
	
	public void setApriv(int apriv){
		this.apriv = apriv;
	}
	
	public int getApriv(){
	 return apriv;
	}
	
}