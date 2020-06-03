package spring.specs;

import org.springframework.stereotype.Component;

import spring.interfaces.Engine;
@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String type() {
		return "V6 engine";
	}

}
