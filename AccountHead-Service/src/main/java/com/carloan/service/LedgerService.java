package com.carloan.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.carloan.model.Ledger;

public interface LedgerService {
	public Ledger addLedgerData( Ledger l);
	public List<Ledger>getAllDetails();
	public List<Ledger>deleteById(int id);
	  public List<Ledger>updateLedger();
}
