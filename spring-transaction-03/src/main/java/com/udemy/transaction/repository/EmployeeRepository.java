package com.udemy.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.transaction.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
