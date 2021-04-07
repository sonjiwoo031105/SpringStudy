package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean t1 = ctx1.getBean(TestBean.class);
		System.out.println("t1: "+t1);
		
		TestBean t2 = ctx1.getBean(TestBean.class);
		System.out.println("t2: "+t2);
		
		TestBean2 t3= ctx1.getBean(TestBean2.class);
		System.out.println(t3.getA());
		System.out.println(t3.getB());
		System.out.println(t3.getC());
		System.out.println(t3.getD());
		

		System.out.println("=============================================================================");

		TestBean3 t4 = ctx1.getBean(TestBean3.class);
		System.out.println(t4.getData1());
		System.out.println(t4.getData2());
		System.out.println(t4.getData3());
		System.out.println(t4.getData4());

		


		ctx1.close();
		
		System.out.println("=============================================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		 TestBean3 tb3 = ctx2.getBean("java1", TestBean3.class);

		 System.out.println(tb3.getData1());
		 System.out.println(tb3.getData2());
			
		ctx2.close();
	}

}
