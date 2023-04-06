package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class Controller {

	@Autowired
	EmployeeService empserv;
	
	@RequestMapping("/employees")
	public List<Employee> getallEmployees() {
		
		List<Employee> list = empserv.findAll();
		
		return list;
	}
}
