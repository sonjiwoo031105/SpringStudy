package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		
		TestBean1 t2 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2 : " + t2);
		
		TestBean2 t3 = ctx.getBean("obj2", TestBean2.class);
		System.out.println(t3.getA() + " " + t3.getB() + " " + t3.getC() + " " + t3.getD1());
		
		TestBean2 t4 = ctx.getBean("obj3", TestBean2.class);
		System.out.println(t4.getA() + " " + t4.getB() + " " + t4.getC() + " " + t4.getD1());
		
		System.out.println();
		
		TestBean3 t5 = ctx.getBean("obj4", TestBean3.class);
		System.out.println("t5 : " + t5);
		System.out.println("t5.data1 : " + t5.getData1());
		System.out.println("t5.data2 : " + t5.getData2());
		System.out.println("t5.data3 : " + t5.getData3());
		System.out.println("t5.data4 : " + t5.getData4());
		System.out.println("t5.data5 : " + t5.getData5());
		
		ctx.close();
	}

}
