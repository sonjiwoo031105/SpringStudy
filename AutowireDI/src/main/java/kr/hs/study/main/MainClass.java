package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("obj1 : " + obj1);
		System.out.println("obj1.data1 : " + obj1.getData1());
		System.out.println("obj1.data2 : " + obj1.getData2());
		
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj2.data1 : " + obj2.getData1());
		System.out.println("obj2.data2 : " + obj2.getData2());
		
		System.out.println();
		
		TestBean2 obj3 = ctx.getBean("t3", TestBean2.class);
		System.out.println("obj3 : " + obj3);
		System.out.println("obj3.data3 : " + obj3.getData3());
		System.out.println("obj3.data4 : " + obj3.getData4());
		
		ctx.close();	
	}

}
