import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
	private String name;

	public Data(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
	
}
public class LambdaExpressionExample {
	public static void main(String a[]) {
		
		List<Data> list=new ArrayList<>();
		list.add(new Data("chirag"));
		list.add(new Data("chirag2aaa"));
		list.add(new Data("chirag3a"));
		list.add(new Data("chirag4aaaaa"));
		
		Collections.sort(list,(Data o1,Data o2)->{
			if(o1.getName().length()<o2.getName().length()) {return -1;}
			else if(o1.getName().length()>o2.getName().length()) {return 1;}

				return 0;
			});
		for(Data data:list) {
			System.out.println(data.getName());
		}

	}
}
