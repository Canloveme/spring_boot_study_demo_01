package cn.csq.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * //@Mapper 指定这是一个操作数据库的mapper
 *
 * @author csq
 * @date 2020/11/4 17:53:55
 */
@Mapper
//一定要使用@Mapper或者是MapperScan将接口扫描装配到容器中
public interface DepartmentMapper {


}
