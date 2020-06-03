package spring.specs;

import org.springframework.stereotype.Component;

import spring.interfaces.Engine;
@Component("V8Engine")
public class V8 implements Engine {

	@Override
	public String type() {
		return "V8 engine";
	}

}
