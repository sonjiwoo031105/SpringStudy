package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean;

@Configuration
public class JavaConfig {
	@Bean
	public TestBean java1() {
		return new TestBean(1, "1", d3(), d4());
	}
	
	@Bean
	public DataBean3 d3() {
		return new DataBean3();
	}
	@Bean
	public DataBean4 d4() {
		return new DataBean4();
	}
}
