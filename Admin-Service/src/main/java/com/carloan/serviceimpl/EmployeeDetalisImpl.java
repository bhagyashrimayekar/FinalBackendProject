package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.EmployeeDetails;
import com.carloan.repository.EmployeeDetailsRepository;
import com.carloan.service.EmployeeDetailsService;

@Service
public class EmployeeDetalisImpl implements EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepository repo;

	@Override
	public EmployeeDetails addEmployee(EmployeeDetails employeeDetails) {
		return repo.save(employeeDetails);
	}

	@Override
	public List<EmployeeDetails> getEmpDetails() {
		List<EmployeeDetails> emplist = repo.findAll();
		return emplist;
	}

	@Override
	public List<EmployeeDetails> deteleEmp(int empid) {

		repo.deleteById(empid);
		return repo.findAll();
	}

	@Override
	public EmployeeDetails updateEmpDetail(EmployeeDetails employeeDetails) {
		return repo.save(employeeDetails);
	}

	@Override
	public EmployeeDetails getEmpById(int empid) {
		return repo.findById(empid).get();
	}

}
