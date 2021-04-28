package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
@ComponentScan(basePackages= {"kr.hs.study.dto", "kr.hs.study.dao"})
public class JavaConfig {
	@Bean
	//데이터 베이스 접속정보를 가지고 있는 bean을 만든다.
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("SCOTT");
		source.setPassword("tiger");
		return source;
	}
	//데이터베이스에 접속해서 쿼리를 전달하는 bean을 등록한다.
	//jdbcTemplate : 데이터베이스에 접속해서 쿼리를 전달하는 bean이다.
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
}
