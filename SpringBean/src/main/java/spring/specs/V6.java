package spring.specs;

import spring.interfaces.Engine;

public class V6 implements Engine {

	@Override
	public String type() {
		return "V6 engine";
	}

}
