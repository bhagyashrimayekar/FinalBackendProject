package com.carloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.CustomerVerification;

@Repository
public interface CustomerVerificationRepository extends JpaRepository<CustomerVerification, Integer> {

}
