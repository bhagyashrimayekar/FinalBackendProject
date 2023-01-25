package com.carloan.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.carloan.model.AllPersonalDocs;
import com.carloan.repository.DocumentRepo;

@RestController
@RequestMapping("/DocumentUpload")
public class DocsController {
	
	@Autowired
	private DocumentRepo repo;

	@PostMapping("/saveDoc")
	public ResponseEntity<String> saveDoc
	(@RequestPart MultipartFile f1,
			@RequestPart MultipartFile f2,
			@RequestPart MultipartFile f3,
			@RequestPart MultipartFile f4,
			@RequestPart MultipartFile f5,
			@RequestPart MultipartFile f6) throws IOException{
		AllPersonalDocs doc=new AllPersonalDocs();
		doc.setPhoto(f1.getBytes());
		doc.setAdharCard(f2.getBytes());
		doc.setPanCard(f2.getBytes());
		doc.setSalarySlips(f4.getBytes());
		doc.setBankStatement(f5.getBytes());
		doc.setAddressProof(f6.getBytes());
		
		repo.save(doc);
		return new ResponseEntity<String>("saved",HttpStatus.CREATED);
	}
}
