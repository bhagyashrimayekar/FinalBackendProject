package com.carloan.service;

import java.util.List;

import com.carloan.model.EmployeeDetails;

public interface EmployeeDetailsService {

	public EmployeeDetails addEmployee(EmployeeDetails employeeDetails);

	public List<EmployeeDetails> getEmpDetails();

	public List<EmployeeDetails> deteleEmp(int empid);
	
	public EmployeeDetails updateEmpDetail(EmployeeDetails employeeDetails);

}
