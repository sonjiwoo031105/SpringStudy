package kr.hs.study.beans;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		
	}
	
	public void volumeUP() {
		System.out.println("SoniSpeaker volumeUP");
	}

	public void volumeDown() {
		System.out.println("SoniSpeaker volumeDown");
	}
}
