package cn.csq.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBoot06DataJdbcDruidApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
           /* if (name.contains("datasource")) {
                System.out.println(name);
            }*/
            System.out.println(name);
        }

    }

}
