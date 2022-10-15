package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.EmployeeException;
import com.example.demo.exception.TaskException;
import com.example.demo.module.Employee;
import com.example.demo.module.Task;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public Employee getDetailsOfEmployee(Integer id) throws EmployeeException ;
	
	public Employee deleteEmployee(Integer id) throws EmployeeException;
	
	public List<Task> listOfTasks(Integer id) throws EmployeeException, TaskException;
	
	
	
}
