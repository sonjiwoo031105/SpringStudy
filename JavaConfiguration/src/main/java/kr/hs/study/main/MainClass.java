package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// xml 설정
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		
		ctx1.close();
		
		System.out.println("-----------------------------------------------");
		
		// java 설정
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean1 t2 = ctx2.getBean("java1", TestBean1.class);
		System.out.println("t2 : " + t2);
		
		TestBean1 t3 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t3 : " + t3);
		TestBean1 t4 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t4 : " + t4);
		TestBean1 t5 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t5 : " + t5);
		
		System.out.println();
		
		TestBean2 t6 = ctx2.getBean("t1", TestBean2.class);
		System.out.println("t6 : " + t6);
		System.out.println("a : " + t6.getA() + ", b : " + t6.getB() + ", c : " + t6.getC());
		TestBean2 t7 = ctx2.getBean("t2", TestBean2.class);
		System.out.println("t7 : " + t7);
		System.out.println("a : " + t7.getA() + ", b : " + t7.getB() + ", c : " + t7.getC());
		
		ctx2.close();
	}

}
