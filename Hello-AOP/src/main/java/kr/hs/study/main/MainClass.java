package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloEn;
import kr.hs.study.beans.HelloJp;
import kr.hs.study.beans.HelloKr;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HelloKr h1 = ctx.getBean("h1", HelloKr.class);
		h1.Hello1();
		h1.Hello2();
		h1.Hello3();
		
		System.out.println("----------------------");
		
		HelloJp h2 = ctx.getBean("h2", HelloJp.class);
		h2.bye1();
		h2.bye2();
		h2.bye3();
		
		System.out.println("----------------------");
		
		HelloEn h3 = ctx.getBean("h3", HelloEn.class);
		System.out.println(h3.Hi1());
		h3.Hi2();
		h3.Hi3();
		
		System.out.println("----------------------");

		
		ctx.close();
	}

}
