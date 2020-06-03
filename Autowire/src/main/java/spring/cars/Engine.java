package spring.cars;

import org.springframework.stereotype.Component;

@Component
public class Engine {
String type;
public Engine(){
	type="V8";
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
}
