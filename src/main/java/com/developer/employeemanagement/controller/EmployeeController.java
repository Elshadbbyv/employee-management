package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/all")
    public List<EmployeeEntity> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("findById/{id}")
    public Optional<EmployeeEntity> findById(@PathVariable("id") Long id){
        return employeeService.findById(id);
    }
    @PostMapping("save")
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.saveEmployee(employeeEntity);
    }
    @PutMapping("update")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.updateEmployee(employeeEntity);
    }
    @DeleteMapping("deleteById/{id}")
    public  void deleteEmployee(@PathVariable("id")Long id){
        employeeService.deleteEmployee(id);
    }


}
