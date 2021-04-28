package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import kr.hs.study.dto.BookDTO;


@Component
public class BookDAO{
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Autowired
	MapperClass mapper;
	//저장
	public void insert_data(BookDTO dto) {
		String sql = "insert into book values(?,?,?,?)";
		jdbctemplate.update(sql, dto.getTitle(), dto.getAuthon(), dto.getPrice(), dto.getPub_date());
		System.out.println("저장 완료");
	}
	
	//수정
	public void update_data(BookDTO dto) {
		String sql = "update book set title=? where authon=? ";
		jdbctemplate.update(sql, dto.getTitle(), dto.getAuthon());
		System.out.println("수정 완료");
	}
	
	//삭제
	public void delete_data(BookDTO dto) {
		String sql = "delete from book where title=?";
		jdbctemplate.update(sql, dto.getTitle());
		System.out.println("삭제 완료");
	}
	
	//가져오기
	public List<BookDTO> select_data(){
		String sql = "select * from book";
		List<BookDTO> list = jdbctemplate.query(sql, mapper);
		return list;
	}
}
