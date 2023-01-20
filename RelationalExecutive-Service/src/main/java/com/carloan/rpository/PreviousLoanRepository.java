package com.carloan.rpository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.PreviousLoan;

@Repository
public interface PreviousLoanRepository extends JpaRepository<PreviousLoan, Integer>  {
	public PreviousLoan findByPloanId(int ploanId);

}