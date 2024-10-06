package SpringJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import Dao.EmpDao;
import Dao.EmpDaoImpl;

@Configuration
@ComponentScan(basePackages = "Dao")
public class SpringJdbcConfig {

	@Bean(name = { "jdbcconfig" })
	public DataSource setDataSource() {

		DriverManagerDataSource dSource = new DriverManagerDataSource();
		dSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dSource.setPassword("root");
		dSource.setUsername("root");
		return dSource;

	}

	@Bean(name = "data")
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(setDataSource());
		return jdbcTemplate;

	}

//	@Bean("empdao")
//	public EmpDao empDaoImpl() {
//		EmpDaoImpl dao = new EmpDaoImpl();
//		dao.setJdbcTemplate(jdbcTemplate());
//		return dao;
//	}
}
