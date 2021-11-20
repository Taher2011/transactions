package com.udemy.transaction.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_id")
	private Integer empId;

	@Column(name = "emp_name")
	private String empName;


}