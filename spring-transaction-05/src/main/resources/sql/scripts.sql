DROP TABLE IF EXISTS spring_transaction.employee;
DROP TABLE IF EXISTS spring_transaction.health_insurance;
DROP DATABASE IF EXISTS spring_transaction;

CREATE DATABASE spring_transaction;


CREATE TABLE spring_transaction.employee (
  emp_id int NOT NULL AUTO_INCREMENT,
  emp_name VARCHAR(100) NOT NULL,
  PRIMARY KEY (emp_id)
);

CREATE TABLE spring_transaction.health_insurance (
  emp_id int NOT NULL AUTO_INCREMENT,
  health_insurance_scheme_name VARCHAR(100) NOT NULL,
  coverage_amount VARCHAR(100) NOT NULL,
  PRIMARY KEY (emp_id)
);