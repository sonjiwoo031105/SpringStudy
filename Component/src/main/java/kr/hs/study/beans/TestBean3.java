package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Lazy
@Scope("prototype") //객체 두개이상 생성해서 주솟값 다른지 확인
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 기본생성자");
	}
}
