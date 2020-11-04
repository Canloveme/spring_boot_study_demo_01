package cn.csq.springboot.repository;

import cn.csq.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承JpaRepository来完成对数据库的操作
 * @author csq
 * @date 2020/11/4 20:14:52
 */
//创建一个接口继承JPA中提供的各种接口就可以了，泛型第一个参数是实体类，第二个是实体类的主键类型
public interface UserRepository extends JpaRepository<User,Integer> {
}
