package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {
	public void before() {
		System.out.println("before 호출됨");
	}
	public void after() {
		System.out.println("after 호출됨");
	}
	public void around(ProceedingJoinPoint pjp) throws Throwable { 
		System.out.println("around 호출 1");
		pjp.proceed(); //비지니스 로직 실행
		System.out.println("around 호출 2");
	}
	public int around_int(ProceedingJoinPoint pjp) throws Throwable { 
		System.out.println("around 호출 1");
		int a = (Integer) pjp.proceed(); //비지니스 로직 실행
		System.out.println("around 호출 2");
		return a;
	}
	public void a() {
		System.out.println("after-returning 호출");
	}
	public void after_Throwing(Exception e) {
		System.out.println("after-throwing 호출");
	}
}
