package com.udemy.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.udemy.transaction.entity.Employee;
import com.udemy.transaction.entity.HealthInsurance;
import com.udemy.transaction.service.OrganzationService;

@Controller
public class OrganizationController {

	@Autowired
	private OrganzationService organzationService;

	public void joinOrganization(Employee employee, HealthInsurance employeeHealthInsurance) {
		organzationService.joinOrganization(employee, employeeHealthInsurance);
	}

}
