package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration
public class JavaConfig {
	
	// <bean id="obj1" class="kr.hs.study.beans.TestBean1"/>
	@Bean
	public TestBean1 java1() {	// 메서드 이름이 bean id
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	@Bean(name="new", initMethod = "init", destroyMethod = "destroy")	// initMethod : 생성자다음 destroyMethod : close() 전
	@Lazy					//lazy-init
	@Scope("prototype")		//scope
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean2 t1() {
		TestBean2 t2 = new TestBean2(10, "spring1", new DataBean2());
		return t2;
	}
	@Bean
	public TestBean2 t2() {
		TestBean2 t2 = new TestBean2();
		t2.setA(20);
		t2.setB("spring2");
		t2.setC(new DataBean2());
		return t2;
	}
	
}
