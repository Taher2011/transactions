package com.udemy.transaction.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the employee database table.
 * 
 */
@Data
@NoArgsConstructor
public class Employee {

	private Integer empId;

	private String empName;

	private String coverageAmount;

	private String healthInsuranceSchemeName;

}