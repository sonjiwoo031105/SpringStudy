package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean {
	public TestBean() {
		System.out.println("TestBean�� �⺻������");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init �޼���");
	} 
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy �޼���");
	}
}
