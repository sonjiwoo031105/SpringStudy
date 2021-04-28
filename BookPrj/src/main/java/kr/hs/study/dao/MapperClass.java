package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class MapperClass implements RowMapper<BookDTO>{

	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BookDTO dto = new BookDTO();
		dto.setTitle(rs.getString("title"));
		dto.setAuthon(rs.getString("authon"));
		dto.setPrice(rs.getInt("price"));
		dto.setPub_date(rs.getString("pub_date"));
		return dto;
	}
	
}
