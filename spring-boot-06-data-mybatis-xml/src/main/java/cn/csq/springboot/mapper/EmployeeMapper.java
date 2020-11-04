package cn.csq.springboot.mapper;

import cn.csq.springboot.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author csq
 * @date 2020/11/4 18:57:28
 */
@Mapper
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
