package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Hyundai;
import kr.hs.study.beans.Kia;

@Configuration
public class JavaConfig {
	@Bean
	public Hyundai car1() {
		return new Hyundai("avante", "blue");
	}
	
	@Bean
	public Kia car2() {
		Kia kia = new Kia();
		kia.setName("k5");
		kia.setColor("red");
		kia.setPrice(2000);
		return kia;
	}
}
