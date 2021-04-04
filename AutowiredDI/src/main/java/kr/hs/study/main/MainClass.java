package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean t1 = ctx1.getBean("obj1", TestBean.class);
		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t1.data2 : " + t1.getData2());
		System.out.println("t1.data3 : " + t1.getData3());
		System.out.println("t1.data4 : " + t1.getData4());

		ctx1.close();

		System.out.println("-----------------------------------------");

		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);

		TestBean t2 = ctx2.getBean("java1", TestBean.class);
		System.out.println("t2.data1 : " + t2.getData1());
		System.out.println("t2.data2 : " + t2.getData2());
		System.out.println("t2.data3 : " + t2.getData3());
		System.out.println("t2.data4 : " + t2.getData4());

		ctx2.close();
	}

}
