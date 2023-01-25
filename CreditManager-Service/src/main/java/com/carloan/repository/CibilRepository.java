package com.carloan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.Cibil;

@Repository

public interface CibilRepository extends JpaRepository<Cibil, Integer> {
	
	

}
