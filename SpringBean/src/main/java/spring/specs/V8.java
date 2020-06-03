package spring.specs;


import spring.interfaces.Engine;

public class V8 implements Engine {

	@Override
	public String type() {
		return "V8 engine";
	}

}
