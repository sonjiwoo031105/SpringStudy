package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hyundai;
import kr.hs.study.beans.Kia;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Hyundai car1 = ctx.getBean("car1", Hyundai.class);
		System.out.println("가격 : " + car1.money(1000));
		car1.order();
		System.out.println("name : " + car1.getName());
		System.out.println("color : " + car1.getColor());
		
		System.out.println();
		
		Kia car2 = ctx.getBean("car2", Kia.class);
		System.out.println("가격 : " + car2.money(2000));
		car2.order();
		System.out.println("name : " + car2.getName());
		System.out.println("color : " + car2.getColor());
		
		ctx.close();
	}

}
