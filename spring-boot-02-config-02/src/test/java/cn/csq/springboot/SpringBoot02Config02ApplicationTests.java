package cn.csq.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02Config02ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testClassPath() {
		System.out.println(this.getClass().getResource("/"));
	}

}
