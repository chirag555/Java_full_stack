package spring.cars;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.interfaces.Car;
import spring.interfaces.Engine;

public class Swift implements Car {
	
	@Autowired
	@Qualifier("V6Engine")
	Engine v6;

	public String specs() {
		String specs="Maruti Suzuki "+v6.type();
		return specs;
		
	}

}
