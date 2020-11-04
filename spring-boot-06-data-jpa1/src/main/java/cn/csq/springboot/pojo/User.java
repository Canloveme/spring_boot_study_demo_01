package cn.csq.springboot.pojo;

import javax.persistence.*;

/**
 * 配置映射关系，使用JPA注解
 *
 * @author csq
 * @date 2020/11/4 19:53:50
 * //@Entity告诉JAP这是一个实体类(和数据表映射的表)
 * //@Table(name = "tb_user") @Table来指定生成哪个数据表，或者指定各种规则
 * //如果省略默认表名就是首字母小写
 */
@Entity
@Table(name = "tb_user")
public class User {
    //@ID标注这是一个主键
    @Id
    //主键 生成策略：主键策略 strategy = GenerationType.IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //这是和数据表对应的一个列
    //省略 默认列名为字段名
    @Column(name = "name", length = 50)
    private String name;
    @Column
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
