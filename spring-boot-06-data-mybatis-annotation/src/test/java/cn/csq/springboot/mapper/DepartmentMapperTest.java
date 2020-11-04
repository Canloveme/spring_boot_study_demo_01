package cn.csq.springboot.mapper;

import cn.csq.springboot.pojo.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csq
 * @date 2020/11/4 18:25:22
 */
@SpringBootTest
class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void getDepartmentById() {
        System.out.println(departmentMapper.getDepartmentById(1));
    }

    @Test
    void findAll() {
        List<Department> departmentList = departmentMapper.findAll();
        for (Department department : departmentList) {
            System.out.println(department);
        }
    }

    @Test
    void insertDept() {
        Department department = new Department();
        department.setId(2);
        department.setDepartmentName("后勤部");
        departmentMapper.insertDept(department);
        findAll();
    }

    @Test
    void updateDept() {
        int id = 1;
        Department department = departmentMapper.getDepartmentById(id);
        System.out.println("修改前: " + department);
        department.setDepartmentName("总部");
        departmentMapper.updateDept(department);
        System.out.println("修改后： " + departmentMapper.getDepartmentById(id));
    }

    @Test
    void deleteDept() {
        int result = departmentMapper.deleteDept(3);
        System.out.println(result);
        findAll();
    }
}