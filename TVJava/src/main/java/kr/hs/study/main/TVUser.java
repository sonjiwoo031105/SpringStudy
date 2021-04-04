package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.SonySpeaker;
import kr.hs.study.config.JavaConfig;

public class TVUser {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// setter
		SamsungTv tv1 = ctx.getBean("tv1", SamsungTv.class);
		System.out.println("SamsungTv의 가격 : " + tv1.getPrice());
		System.out.println("SamsungTv의 스피커 : " + tv1.getSpeaker());
		
		// constructor
		LgTv tv2 = ctx.getBean("tv2", LgTv.class);
		System.out.println("LgTv의 가격 : " + tv2.getPrice());
		System.out.println("LgTv의 스피커 : " + tv2.getSpeaker());
		
		ctx.close();
	}
}
