package cn.csq.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBoot06DataJdbcApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void testDataSource() throws SQLException {
		System.out.println("dataSource: "+ dataSource.getClass());

		Connection connection = dataSource.getConnection();
		System.out.println("connection: " + connection);
		connection.close();
	}

	@Test
	public void testJdbc() {
		List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department;");
		System.out.println(maps);
	}
}
