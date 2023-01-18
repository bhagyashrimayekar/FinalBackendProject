package com.carloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {

}
