package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
//		Test t1 = ctx.getBean(TestBean.class);
//		t1.method1();
		
//		Test t1 = (Test)ctx.getBean("t1");
//		t1.method1();
		
//		Test t1 = ctx.getBean("t1", TestBean.class);
//		t1.method1();
//		System.out.println("t1 : " + t1);
		
//		Test t2 = ctx.getBean("t1", TestBean.class);
//		System.out.println("t2 : " + t2);
		
		Test t2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("t2 :" + t2);
		
		ctx.close();
	}

}
