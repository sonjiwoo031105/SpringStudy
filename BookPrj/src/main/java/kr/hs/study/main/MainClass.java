package kr.hs.study.main;

import java.sql.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.BookDAO;
import kr.hs.study.dto.BookDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		BookDAO dao = ctx.getBean(BookDAO.class);

		BookDTO dto1 = ctx.getBean(BookDTO.class);
		dto1.setTitle("바보");
		dto1.setAuthon("손지우");
		dto1.setPrice(10000);
		dto1.setPub_date("2021-04-28");
		dao.insert_data(dto1);

		
		BookDTO dto2 = ctx.getBean(BookDTO.class); dto2.setTitle("바보");
		dto2.setAuthon("손지유"); dao.update_data(dto2);
		 
		BookDTO dto3 = ctx.getBean(BookDTO.class); dto3.setTitle("바보");
		dao.delete_data(dto3);

		List<BookDTO> list = dao.select_data();
		for (BookDTO dto4 : list) {
			System.out.println(dto4.getTitle() + dto4.getAuthon() + dto4.getPrice() + dto4.getPub_date());
		}
		ctx.close();
	}
}
