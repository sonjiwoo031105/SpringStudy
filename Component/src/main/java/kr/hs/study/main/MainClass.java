package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx1.getBean(TestBean1.class);
		System.out.println("t1: "+t1);
		System.out.println("------------------------------------");
		TestBean3 t3 = ctx1.getBean(TestBean3.class);
		System.out.println("t3: "+t3);
		TestBean3 t4 = ctx1.getBean(TestBean3.class);
		System.out.println("t4: "+t4);
		 
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		 TestBean1 t2 = ctx2.getBean(TestBean1.class);
		 System.out.println("t2 :" + t2);
		
		 
		ctx2.close();
	}

}
