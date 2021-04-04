package kr.hs.study.beans;

public class Kia implements Car{
	String name;
	String color;
	int price;
	
	public Kia() {
		
	}
	public Kia(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = money(price);
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int money(int money) {
		return money;
	}
}
