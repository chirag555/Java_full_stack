import shop.Door;

public class Shop {

	public static void main(String[] args) 
	{
		
		
		//Door door=new Door();
		
		
		if(new Door().isLocked(args[0])) {
			System.out.println("Closed");
		}else
			System.out.println("Open");		
	}
	
}
