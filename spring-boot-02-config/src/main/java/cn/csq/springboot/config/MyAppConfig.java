package cn.csq.springboot.config;


import cn.csq.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * //@@Configuration:指明当前类是一个配置类，就是来替代之前的Spring配置文件
 *  等同于在配置文件xml中使用的<bean><bean/>标签来添加组件
 * @author csq
 * @date 2020/11/3 16:18:25
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件的默认id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
