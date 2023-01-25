package com.carloan.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.carloan.model.Cibil;



@FeignClient(name ="creditmanager")
public interface CMToOECibil {
	
	
	@GetMapping("cibil/getcibildetailsbyid/{cibilId}")
	public ResponseEntity<Cibil>  getcibildetailbyid(@PathVariable int cibilId);
	

}
