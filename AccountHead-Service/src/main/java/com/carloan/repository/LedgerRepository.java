package com.carloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloan.model.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Integer> {

}
