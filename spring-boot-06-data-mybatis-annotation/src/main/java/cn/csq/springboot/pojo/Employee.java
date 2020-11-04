package cn.csq.springboot.pojo;

import lombok.Data;

/**
 * @author csq
 * @date 2020/11/4 18:02:54
 */
@Data
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private  Integer dId;
}
