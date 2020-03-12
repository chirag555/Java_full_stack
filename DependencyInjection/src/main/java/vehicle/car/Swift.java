package vehicle.car;

import org.springframework.stereotype.Component;

import vehicle.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		return "Hatchback from suzuki";
	}

}
