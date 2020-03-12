package vehicle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vehicle.car.Corolla;
import vehicle.car.Swift;
import vehicle.interfaces.Car;

public class App {

	public static void main(String[] args) {
		//Car Swift = new Swift();
		//Car Corolla = new Corolla();
		//System.out.println(Swift.specs());
		//System.out.println(Corolla.specs());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("myCorolla",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
