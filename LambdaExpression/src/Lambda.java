interface LambdaI{
	public void demo();
}
public class Lambda {
	public static void main(String a[]) {
		int x=10;
		LambdaI lamb=()->{
			System.out.println("inteface");
			System.out.println("second statement");
			};
			lamb.demo();
}
}