package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void before() {
		System.out.println("before 호출됨");
	}
	public void after() {
		System.out.println("after 호출됨");
	}
	public int around(ProceedingJoinPoint pjp) throws Throwable { //매개변수로 비지니스로직 호출
		System.out.println("around 호출 1");
		int a = (Integer) pjp.proceed(); //비지니스 로직 실행
		System.out.println("around 호출 2");
		return a;
	}
	public void a() {
		System.out.println("after returning 호출됨");
	}
	
	public void after_Throwing(Exception e) {
		System.out.println("after throwing 호출");
	}
}
