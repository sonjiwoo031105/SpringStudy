package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class TestBean {
	private int data1;
	private String data2;
	//@Autowired
	private DataBean3 data3;
	//@Autowired
	private DataBean4 data4;
	
	// @Qualifier : 이름으로 주입
	// @Autowire : 타입으로 주입
	private DataBean4 data5;
	
	/*@Autowired
	public TestBean(DataBean3 data3, DataBean4 data4) {
		super();
		this.data3 = data3;
		this.data4 = data4;
	}*/
	@Autowired
	public TestBean(@Value("100")int data1, @Value("spring1")String data2, DataBean3 data3, DataBean4 data4) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}


	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public DataBean3 getData3() {
		return data3;
	}
	/*@Autowired
	public void setData3(DataBean3 data3) {
		this.data3 = data3;
	}*/
	public DataBean4 getData4() {
		return data4;
	}
	/*@Autowired
	public void setData4(DataBean4 data4) {
		this.data4 = data4;
	}*/
}
