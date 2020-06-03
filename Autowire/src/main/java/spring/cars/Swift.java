package spring.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.interfaces.Car;
@Component("swift")
public class Swift implements Car {
	
	Engine engine;
	@Autowired(required = false)
	public void setEngine(Engine engine) {
		engine.type="1000cc";
		this.engine = engine;
	}

	public String specs() {
		String specs="Maruti Suzuki "+ engine.getType();
		return specs;
		
	}

}
