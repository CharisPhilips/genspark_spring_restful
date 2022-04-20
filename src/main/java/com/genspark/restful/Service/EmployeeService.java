package com.genspark.restful.Service;

import java.util.List;

import com.genspark.restful.Entity.EmployeeEntity;

public interface EmployeeService {
    public List<EmployeeEntity> getAllEmployee();
    public EmployeeEntity getEmployeeById(Long employeeId);
    public EmployeeEntity addEmployee(EmployeeEntity employee);
    public EmployeeEntity updateEmployee(EmployeeEntity employee);
    public Boolean deleteEmployeeById(Long employeeId);
}
