package spring.cars;

import org.springframework.stereotype.Component;

import spring.interfaces.Car;
@Component("ind")
public class Indica implements Car {

	public String specs() {
		return "Tata Motors";
	}

}
