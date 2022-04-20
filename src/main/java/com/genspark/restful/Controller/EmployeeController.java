package com.genspark.restful.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.genspark.restful.Entity.EmployeeEntity;
import com.genspark.restful.Service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping({"/employee"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<EmployeeEntity> getEmployees() {
        return this.employeeService.getAllEmployee();
    }

    @GetMapping("/{eId}")
    public EmployeeEntity getEmployee(@PathVariable Long eId) {
        return this.employeeService.getEmployeeById(eId);
    }

    @PostMapping("/")
    public EmployeeEntity addNewEmployee(@RequestBody EmployeeEntity e) {
        return this.employeeService.addEmployee(e);
    }

    @PutMapping(value = "/")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity e) {
        return this.employeeService.updateEmployee(e);
    }

    @DeleteMapping("/{eId}")
    public Boolean deleteEmployee(@PathVariable Long eId) {
        return this.employeeService.deleteEmployeeById(eId);
    }
}
