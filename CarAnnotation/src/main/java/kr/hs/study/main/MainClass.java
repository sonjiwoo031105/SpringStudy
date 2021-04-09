package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Hyundai;
import kr.hs.study.config.JavaConfig;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Hyundai h1 = ctx.getBean(Hyundai.class);

		 System.out.println(h1.getName());
		 System.out.println(h1.getColor());
			
		ctx.close();

	}

}
