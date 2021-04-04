package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestUser;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean1 obj1 = new TestBean1();
		obj1.prData();

		System.out.println();

		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		obj2.prData();

		System.out.println();

		TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
		obj3.prData();

		System.out.println();

		TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
		obj4.prData();
		
		System.out.println();

		TestBean1 obj5 = ctx.getBean("t5", TestBean1.class);
		obj5.prData();
		
		System.out.println();

		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.prData();

		System.out.println();
		System.out.println();
		
		TestUser user = ctx.getBean("testUser", TestUser.class);
		user.prData();
		
		System.out.println();
		
		TestBean3 obj7 = ctx.getBean("t7", TestBean3.class);
		System.out.println("obj7.data1 : " +  obj7.getData1());
		System.out.println("obj7.data2 : " +  obj7.getData2());
		
		ctx.close();
	}
}
