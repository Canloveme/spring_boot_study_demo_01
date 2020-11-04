package cn.csq.springboot.controller;

import cn.csq.springboot.mapper.DepartmentMapper;
import cn.csq.springboot.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author csq
 * @date 2020/11/4 18:20:05
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    public DepartmentMapper departmentMapper;

    @GetMapping
    public List<Department> departments() {
        return departmentMapper.findAll();
    }

    @GetMapping("/{id}")
    public Department getDeptById(@PathVariable("id") Integer id) {
        return departmentMapper.getDepartmentById(id);
    }

    @PostMapping
    public void insert(@RequestBody Department department) {
        departmentMapper.insertDept(department);
    }

    @PutMapping
    public void update(@RequestBody Department department) {
        departmentMapper.updateDept(department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        departmentMapper.deleteDept(id);
    }
}
