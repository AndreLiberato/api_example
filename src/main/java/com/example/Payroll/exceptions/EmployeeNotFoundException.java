package com.example.Payroll.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
  public EmployeeNotFoundException() {
    // EMPTY
  }

  public EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}
