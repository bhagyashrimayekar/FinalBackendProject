package com.carloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.AllPersonalDocs;

@Repository
public interface DocumentRepo extends JpaRepository<AllPersonalDocs, Integer>{

}
