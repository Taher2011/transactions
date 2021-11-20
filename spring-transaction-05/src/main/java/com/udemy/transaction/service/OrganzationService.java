package com.udemy.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.transaction.entity.Employee;
import com.udemy.transaction.entity.HealthInsurance;

@Service
public class OrganzationService {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private HealthInsuranceService healthInsuranceService;

	@Transactional(propagation = Propagation.REQUIRED)
	public void joinOrganization(Employee employee, HealthInsurance healthInsurance) {
		employeeService.insertEmployee(employee);
//		if (employee.getEmpId().equals(12345678)) {
//			throw new RuntimeException("throwing exception to test transaction roll-back");
//		}
		healthInsuranceService.insertHealthInsurance(healthInsurance);
	}

}
