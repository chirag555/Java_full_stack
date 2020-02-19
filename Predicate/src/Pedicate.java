import java.util.function.IntPredicate;

public class Pedicate {
	public static void main(String[] args){		
		/*
		IntPredicate lessthan10=new IntPredicate() 		{			
			@Override
			public boolean test(int value) 			{
				if(value<10)
					return true;
				else
					return false;
			}
		};		
				*/
		IntPredicate lessThan10 =i->i<10&&i>5;
		IntPredicate search7 =i->i==7;		
		//System.out.println(lessThan10.and(search7).test(7));
		new Pedicate().demo(7,lessThan10,search7);
	}
	public void demo(int x,IntPredicate lessThan10,IntPredicate search7){
		if(lessThan10.and(search7).test(x))
		System.out.println("less than 10 more than 5 equals 7 ");
		else
			System.out.println("invalid input");
	}

}
