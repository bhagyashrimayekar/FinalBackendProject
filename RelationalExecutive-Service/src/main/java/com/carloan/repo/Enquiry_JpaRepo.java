package com.carloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.Enquiry;

@Repository
public interface Enquiry_JpaRepo extends JpaRepository<Enquiry, Integer>{

}
