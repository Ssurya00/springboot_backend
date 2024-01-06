package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
