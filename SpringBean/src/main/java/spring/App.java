package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.interfaces.Car;

public class App {

	public static void main(String[] args) {
		/*
		Car swift=new Swift();
		Car indica=new Indica();
		System.out.println(swift.specs());
		System.out.println(indica.specs());
		
		Car myCar=new Swift();
		System.out.println(myCar.specs());
		*/
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar=context.getBean("swift",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
