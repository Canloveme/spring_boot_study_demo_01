package cn.csq.springboot.mapper;

import cn.csq.springboot.pojo.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author csq
 * @date 2020/11/4 18:04:45
 */
//@Mapper 指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id};")
    Department getDepartmentById(Integer id);

    @Select("select * from department")
    List<Department> findAll();

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    int insertDept(Department department);

    @Update("update department set departmentName =#{departmentName} where id=#{id}")
    int updateDept(Department department);

    @Delete("delete from department where id=#{id}")
    int deleteDept(Integer id);
}
