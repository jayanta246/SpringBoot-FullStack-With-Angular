package com.employeeManagement.SpringBoot.FullStack.With.Angular.repository;

import com.employeeManagement.SpringBoot.FullStack.With.Angular.Model.Employee;
import com.employeeManagement.SpringBoot.FullStack.With.Angular.exception.UserNotFundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }

    public Employee findEmployee(Long id) throws Throwable {
      return employeeRepository.findEmployeeById(id).orElseThrow(()->new UserNotFundException("User Not Found"));
    }
}
