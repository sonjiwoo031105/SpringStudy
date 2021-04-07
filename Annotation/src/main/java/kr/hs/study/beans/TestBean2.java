package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean2 {
	private int a;
	private String b;
	//component scan시 autowired가 있으면 자동주입을 시킨다.
	// DataBean3 bean이 등록되어 있으면 주소값을 c에 대입한다.
	@Autowired
	private DataBean3 c;
	@Autowired
	private DataBean4 d;
	
	public TestBean2() {
		System.out.println("TestBean2 메서드");
	}

	@PostConstruct
	public void init() {
		System.out.println("init 메서드");
	} 
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy 메서드");
	}
	
	public int getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public DataBean3 getC() {
		return c;
	}

	public DataBean4 getD() {
		return d;
	}
	
	
}
