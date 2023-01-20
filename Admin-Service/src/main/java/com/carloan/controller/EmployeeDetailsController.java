package com.carloan.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.EmployeeDetails;
import com.carloan.service.EmployeeDetailsService;

@RestController
@RequestMapping("/EmployeeDetails")
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService serv;

	@PostMapping("/addEmployee")
	public EmployeeDetails addEmployee(@RequestBody EmployeeDetails employeeDetails) {
		EmployeeDetails emp = serv.addEmployee(employeeDetails);
		return emp;
	}

	@GetMapping("/getEmpDetails")
	public List<EmployeeDetails> getEmpDetails() {
		List<EmployeeDetails> emplist = serv.getEmpDetails();
		return emplist;
	}

	@DeleteMapping("/deleteEmp/{empid}")
	public String deleteEmp(@PathVariable int empid) {
		List<EmployeeDetails> emplist = serv.deteleEmp(empid);
		return "Employee Deleted";
	}
	
	@GetMapping("/getEmpById/{empid}")
	public EmployeeDetails getEmpById(@PathVariable int empid) {
		return serv.getEmpById(empid);
	}
	
	@PutMapping("/updateEmpDetail")
	public EmployeeDetails updateEmpDetails(@RequestBody EmployeeDetails employeeDetails) {
		return serv.updateEmpDetail(employeeDetails);
	}

}
