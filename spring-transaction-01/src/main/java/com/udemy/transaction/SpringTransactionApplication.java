package com.udemy.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.udemy.transaction.controller.OrganizationController;
import com.udemy.transaction.entity.Employee;
import com.udemy.transaction.entity.HealthInsurance;

@SpringBootApplication
public class SpringTransactionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTransactionApplication.class, args);
		OrganizationController organizationController = context.getBean(OrganizationController.class);

		Employee employee = new Employee();
		employee.setEmpId(123456789);
		employee.setEmpName("Taher");

		HealthInsurance employeeHealthInsurance = new HealthInsurance();
		employeeHealthInsurance.setEmpId(123456789);
		employeeHealthInsurance.setHealthInsuranceSchemeName("Savings");
		employeeHealthInsurance.setCoverageAmount("20000");

		organizationController.joinOrganization(employee, employeeHealthInsurance);
	}

}
