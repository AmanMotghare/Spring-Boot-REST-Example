package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmpService implements EmployeeService {

	@Override
	public List<Employee> findAll() {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add( new Employee(101, "Aman", "Motghare", "am@123", "797648397"));
		list.add( new Employee(102, "Pradip", "Motghare", "pm@123","927248397"));
		list.add( new Employee(103, "Arjun Rao", "Motghare", "arm@123","867248397"));
		
		return list;
	}

}
