package com.carloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.SanctionLetter;
@Repository
public interface SanctionLetterRepository extends JpaRepository<SanctionLetter, Integer> {

}
