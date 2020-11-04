package cn.csq.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.csq.springboot.mapper")
public class SpringBoot06DataMybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot06DataMybatisAnnotationApplication.class, args);
	}

}
