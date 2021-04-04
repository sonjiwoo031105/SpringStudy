package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.SonySpeaker;
import kr.hs.study.beans.Speaker;

@Configuration
public class JavaConfig {
	@Bean
	public SamsungTv tv1() {
		SamsungTv tv = new SamsungTv();
		tv.setPrice(10);
		tv.setSpeaker(s1());
		return tv;
	}
	
	@Bean
	public LgTv tv2() {
		return new LgTv(20, s2());
	}
	
	@Bean
	public SonySpeaker s1() {
		return new SonySpeaker();
	}
	
	@Bean
	public AppleSpeaker s2() {
		return new AppleSpeaker();
	}
	
	
}
