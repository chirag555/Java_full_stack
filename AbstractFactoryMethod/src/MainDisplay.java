
public class MainDisplay {
	
	public static Book book(String type1) {
		
		Book book=null;
		
		//String type2="wooden";
		//String type2="plastic";
		
		if(type1.equalsIgnoreCase("metal")) 
		{
			return new MetalBook();
			
		}
		else if(type1.equalsIgnoreCase("wooden")) 
		{
			return new WoodenBook();
		}
		else if(type1.equalsIgnoreCase("plastic")) 
		{
			return new PlasticBook();
		}
		
		return book;
	}
	

}
