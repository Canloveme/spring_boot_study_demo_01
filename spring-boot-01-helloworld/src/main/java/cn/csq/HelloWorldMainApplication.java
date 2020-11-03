package cn.csq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author csq
 * @date 2020/11/3 12:59:02
 */
//@SpringBootApplication 标注该类是一个启动类
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
