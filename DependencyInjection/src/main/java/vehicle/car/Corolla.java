package vehicle.car;

import org.springframework.stereotype.Component;

import vehicle.interfaces.Car;

@Component("myCorolla")
public class Corolla implements Car{

	public String specs() {
		return "Sedan from Toyota";
	}

}
