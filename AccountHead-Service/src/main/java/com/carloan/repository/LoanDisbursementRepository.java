package com.carloan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.LoanDisbursement;

@Repository
public interface LoanDisbursementRepository extends JpaRepository<LoanDisbursement, Integer>{

}
