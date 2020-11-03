package cn.csq.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * //@PropertySource(value = {"classpath:student.properties"})
 * 加载指定的配置文件 类路径下student.properties
 * @author csq
 * @date 2020/11/3 15:45:22
 */
@Component
@ConfigurationProperties(prefix = "student")
@PropertySource(value = {"classpath:student.properties"})
public class Student {
    private String id;
    private String name;
    private String source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
