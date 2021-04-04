package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.SonySpeaker;

public class TVUser {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		// setter
		SamsungTv tv1 = ctx.getBean("tv1", SamsungTv.class);
		System.out.println("SamsungTv의 가격 : " + tv1.getPrice());
		System.out.println("SamsungTv의 스피커 : " + tv1.getSpeaker());
		
		// constructor
		LgTv tv2 = ctx.getBean("tv2", LgTv.class);
		System.out.println("LgTv의 가격 : " + tv2.getPrice());
		System.out.println("LgTv의 스피커 : " + tv2.getSpeaker());
		
		SonySpeaker s1 = ctx.getBean("s1", SonySpeaker.class);
		System.out.println("SonySpeaker : " + s1);
		
		AppleSpeaker s2 = ctx.getBean("s2", AppleSpeaker.class);
		System.out.println("AppleSpeaker" + s2);
		
		ctx.close();
	}
}
