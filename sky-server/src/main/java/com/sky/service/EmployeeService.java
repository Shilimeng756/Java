package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    //新增员工
    void save(EmployeeDTO employeeDTO);



    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    //分页查询
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    //员工账号禁用或启用
    void startOrStop(Integer status, Long id);

    //根据id查询员工信息
    Employee getById(Long id);

    //编辑员工信息
    void update(EmployeeDTO employeeDTO);
}
