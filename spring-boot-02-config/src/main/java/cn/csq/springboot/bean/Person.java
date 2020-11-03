package cn.csq.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * //@ConfigurationProperties
 * 告诉SpringBoot将本类中的所有属性和配置文件中相关的属性进行绑定
 * prefix = "person":，配置前缀，指定这个类中得属性和配置文件中哪个前缀标签下面的所有属性进行一一映射
 * 只有这个组件时容器中的组件，才能使用容器提供的@ConfigurationProperties功能；
 * 使用@Component将组件注入到容器中
 *
 * //@ConfigurationProperties 默认是从全局的配置文件中获取值
 * @author csq
 * @date 2020/11/3 14:43:24
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

    /**
     * <bean class="person">
     *     <property name="lastName value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL表达式}"></property>
     * <bean/>
     */
    @Value("${person.lastName}")
    private String lastName;
    @Value("#{11*2}")
    private Integer age;
    @Value("true")
    private boolean boss;
    @Email
    private String email;
    private Date birth;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }



    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
