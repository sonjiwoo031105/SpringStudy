package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		//obj1.add();
		System.out.println(obj1.abs());
		//obj1.sub();
		obj1.ex();
		ctx.close();
	}

}
