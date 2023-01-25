package com.carloan.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.Ledger;
import com.carloan.repository.LedgerRepository;
import com.carloan.service.LedgerService;

@Service
public class LedgerServiceImpl implements LedgerService{

	@Autowired
	private LedgerRepository repo;
	@Override
	public Ledger addLedgerData(Ledger l) {
	
		return repo.save(l);
	}
	@Override
	public List<Ledger> getAllDetails() {
		 List<Ledger> llist =repo.findAll();
		return llist;
	}
	@Override
	public List<Ledger> deleteById(int id) {
        repo.deleteById(id);
		return repo.findAll();
	}
	@Override
	public List<Ledger> updateLedger() {
		List<Ledger> llist =repo.findAll();
		return llist;
	}

}
