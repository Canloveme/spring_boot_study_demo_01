package cn.csq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// 添加servlet组件扫描，使得Spring能够扫描到我们编写的servlet和filter
@ServletComponentScan
public class SpringBoot06DataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot06DataJdbcApplication.class, args);
	}

}
