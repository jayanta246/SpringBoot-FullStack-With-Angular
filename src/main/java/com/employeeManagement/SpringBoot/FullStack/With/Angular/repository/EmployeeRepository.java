package com.employeeManagement.SpringBoot.FullStack.With.Angular.repository;

import com.employeeManagement.SpringBoot.FullStack.With.Angular.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
