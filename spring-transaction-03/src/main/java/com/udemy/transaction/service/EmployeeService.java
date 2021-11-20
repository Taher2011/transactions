package com.udemy.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.transaction.entity.Employee;
import com.udemy.transaction.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void insertEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
