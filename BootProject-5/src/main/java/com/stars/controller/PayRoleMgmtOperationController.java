package com.stars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.stars.sbeans.Employee;
import com.stars.service.IEmployeeMgmtService;

@Controller("payrole-controller")
public class PayRoleMgmtOperationController {

	@Autowired
	private IEmployeeMgmtService empService;
	
	
	public List<Employee> showEmployeeByRole(String role) throws Exception{
		List<Employee> list=empService.fetchEmployeeByRole(role);
		return list;
	}
	
}
