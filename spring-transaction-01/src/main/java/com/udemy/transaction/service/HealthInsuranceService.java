package com.udemy.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.transaction.entity.HealthInsurance;
import com.udemy.transaction.repository.HealthInsuranceRepository;

@Service
public class HealthInsuranceService {

	@Autowired
	private HealthInsuranceRepository healthInsuranceRepository;

	@Transactional(propagation = Propagation.REQUIRED) // default level is Propagation.REQUIRED
	public void insertHealthInsurance(HealthInsurance healthInsurance) {
		healthInsuranceRepository.save(healthInsurance);
	}

}
