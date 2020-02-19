import java.util.ArrayList;
import java.util.List;
class DataName{
	private String name;

	public DataName(String name) {
				this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}
public class LambdaThread  {
public static void main(String[] args) {
new Thread(()->{
		System.out.println("inside thread 1");
	
	}).start();
	
/*
 List <Integer> list=new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(5);
*/
List<Data> list=new ArrayList<>();
list.add(new Data("chirag"));
list.add(new Data("chirag2aaa"));
list.add(new Data("chirag3a"));
list.add(new Data("chirag4aaaaa"));

new Thread(()->System.out.println("Thread 2")).start();

/*
list.forEach(
		i->{
	if (i>=10) {
		System.out.println(i);
		}
	});
	*/
list.forEach(temp->{
	System.out.println(temp.getName());	
});








	}
}
