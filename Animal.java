public class Animal{
	
	public void sleep(){
		System.out.println("ZZZZ");
	}
	
	public void sneack(){
		System.out.println("hsshhh");
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		Animal[] zoo = new Animal[3];
		zoo[0]=new Animal();
		zoo[1]=new Tiger();
		zoo[2]=new Dog();
		
		zoo[0].sleep();
		zoo[0].sneack();
		
		zoo[1].sleep();
		zoo[1].sneack();
		
		zoo[2].sleep();
		zoo[2].sneack();
		//zoo[2].gav();
		
		Dog doggy = new Dog();
		
		doggy.gav();
		
	}
	
	
	
	
	
}