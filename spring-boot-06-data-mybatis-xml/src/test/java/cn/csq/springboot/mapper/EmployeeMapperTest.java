package cn.csq.springboot.mapper;

import cn.csq.springboot.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csq
 * @date 2020/11/4 19:08:49
 */
@SpringBootTest
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void getEmpById() {
        System.out.println(employeeMapper.getEmpById(1));
    }

    @Test
    void insertEmp() {
        Employee employee = new Employee(1, "张三", 1, "zhangsan@qq.com", 1);
        employeeMapper.insertEmp(employee);
    }
}