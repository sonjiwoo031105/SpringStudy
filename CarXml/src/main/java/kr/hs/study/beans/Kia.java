package kr.hs.study.beans;

public class Kia implements Car{
	String name;
	String color;
	
	public Kia() {
		
	}
	public Kia(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public void order() {
		System.out.println(name + " 주문하다");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int money(int money) {
		return money;
	}
}
