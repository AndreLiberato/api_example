package com.example.Payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Payroll.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
}
