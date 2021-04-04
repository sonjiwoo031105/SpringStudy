package kr.hs.study.beans;

public class SamsungTv implements Tv{
	private int price;
	private SonySpeaker speaker;
	
	public SamsungTv() {
		
	}
	public SamsungTv(int price, SonySpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SonySpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("SamsungTv powerOn");
	}
	public void powerOff() {
		System.out.println("SamsungTv powerOff");
	}

	
}
