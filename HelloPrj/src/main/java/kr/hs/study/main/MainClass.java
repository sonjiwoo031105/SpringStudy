package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Hello t1 = ctx.getBean("t1", HelloWorldEn.class);
		t1.sayHello();
		
		Hello t2 = ctx.getBean("t2", HelloWorldKo.class);
		t2.sayHello();
		
		ctx.close();
	}

}
