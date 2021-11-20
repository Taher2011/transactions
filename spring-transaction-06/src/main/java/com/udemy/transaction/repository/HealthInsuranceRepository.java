package com.udemy.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.transaction.entity.HealthInsurance;

public interface HealthInsuranceRepository extends JpaRepository<HealthInsurance, Integer> {

}
