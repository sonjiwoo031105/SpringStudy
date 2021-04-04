package kr.hs.study.beans;

public class LgTv implements Tv {
	private int price;
	private AppleSpeaker speaker;

	public LgTv() {
		
	}
	public LgTv(int price, AppleSpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public AppleSpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("LgTv powerOn");
	}
	public void powerOff() {
		System.out.println("LgTv powerOff");
	}

}
