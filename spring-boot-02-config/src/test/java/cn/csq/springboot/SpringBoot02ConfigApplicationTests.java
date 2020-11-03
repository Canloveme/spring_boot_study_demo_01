package cn.csq.springboot;

import cn.csq.springboot.bean.Person;
import cn.csq.springboot.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * SpringBoot自动生成的单元测试
 */
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private Student student;

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

	@Test
	public void testPerson() {
		System.out.println(person);
	}

	@Test
	public void testStudent() {
		System.out.println(student);
	}

	@Test
	public void testApplicationContext() {
		boolean helloService = applicationContext.containsBean("helloService");
		//String[] names = applicationContext.getBeanDefinitionNames();
		//Arrays.stream(names).forEach(System.out::println);
		System.out.println(helloService);
	}
}
