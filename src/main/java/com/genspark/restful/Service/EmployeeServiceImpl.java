package com.genspark.restful.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genspark.restful.Dao.EmployeeDao;
import com.genspark.restful.Entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return this.dao.findAll();
    }

    @Override
    public EmployeeEntity getEmployeeById(Long employeeId) {
        Optional<EmployeeEntity> e = this.dao.findById(employeeId);
        EmployeeEntity employee = null;
        if (e.isPresent()) {
            employee = e.get();
        } else {
            throw new RuntimeException("Employee not found for ID :" + employeeId);
        }
        return employee;
    }

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employee) {
        return this.dao.save(employee);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employee) {
        return this.dao.save(employee);
    }

    @Override
    public Boolean deleteEmployeeById(Long employeeId) {
        this.dao.deleteById(employeeId);
        return true;
    }
}
