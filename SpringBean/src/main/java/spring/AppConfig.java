package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.cars.Indica;
import spring.cars.Swift;

import spring.specs.V6;
import spring.specs.V8;

@Configuration
@ComponentScan("spring")
public class AppConfig {
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	@Bean("indica")
	public Indica indica() {
		return new Indica();
	}
	
	@Bean("V8Engine")
	public V8 v8() {
		return new V8();
	}
	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}
	
	
	
}
