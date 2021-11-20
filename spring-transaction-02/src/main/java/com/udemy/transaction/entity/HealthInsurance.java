package com.udemy.transaction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the employeehealthinsurance database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
public class HealthInsurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_id")
	private Integer empId;

	@Column(name = "coverage_amount")
	private String coverageAmount;

	@Column(name = "health_insurance_scheme_name")
	private String healthInsuranceSchemeName;

}