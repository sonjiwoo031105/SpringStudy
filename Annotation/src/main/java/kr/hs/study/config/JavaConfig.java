package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean3;
@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class JavaConfig {
	@Bean
	public TestBean3 java1() {
		TestBean3 tb3 = new TestBean3(200,55.5);
		tb3.setData1(600);
		return tb3;
	}
	


}
