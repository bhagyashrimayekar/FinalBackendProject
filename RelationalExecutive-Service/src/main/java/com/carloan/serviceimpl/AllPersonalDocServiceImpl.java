package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.AllPersonalDocs;
import com.carloan.repository.AllPersonalDocsRepo;
import com.carloan.service.AllPersonalDocService;

@Service
public class AllPersonalDocServiceImpl implements AllPersonalDocService{

	@Autowired
private AllPersonalDocsRepo repo;
	
	
	@Override
	public AllPersonalDocs addDocs(AllPersonalDocs allPersonalDocs) {
	
		return repo.save(allPersonalDocs);
	}


	@Override
	public AllPersonalDocs getAllDocsById(int cid) {
		
		return repo.findById(cid).get();
	}

	
}
