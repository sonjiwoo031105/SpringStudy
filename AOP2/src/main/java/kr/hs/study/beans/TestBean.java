package kr.hs.study.beans;

public class TestBean {
	public void add() {
		System.out.println("add 메서드 호출");
	}
	public int abs() {
		System.out.println("abs 메서드 호출");
		return 100;
	}
	public void sub() {
		System.out.println("sub 메서드 호출");
	}
	public void ex() {
		System.out.println("ex 메서드 호출");
		int a = 10/0;
	}
}
