package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean2 {
	private int a;
	private String b;
	//component scan�� autowired�� ������ �ڵ������� ��Ų��.
	// DataBean3 bean�� ��ϵǾ� ������ �ּҰ��� c�� �����Ѵ�.
	@Autowired
	private DataBean3 c;
	@Autowired
	private DataBean4 d;
	
	public TestBean2() {
		System.out.println("TestBean2 �޼���");
	}

	@PostConstruct
	public void init() {
		System.out.println("init �޼���");
	} 
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy �޼���");
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
