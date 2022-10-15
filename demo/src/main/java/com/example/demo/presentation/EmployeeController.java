package com.example.demo.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.EmployeeException;
import com.example.demo.exception.TaskException;
import com.example.demo.module.Employee;
import com.example.demo.module.EmployeeDTO;
import com.example.demo.module.Task;
import com.example.demo.module.TaskDTO;
import com.example.demo.service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmployeeController {
    @Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDTO empl){
		Employee emp = new Employee();
		emp.setEmpName(empl.getEmpName());
		emp.setEmail(empl.getEmail());
		emp.setMobile(empl.getMobile());
		emp.setState(empl.getState());
		emp.setDesignation(empl.getDesignation());
		Employee employee = employeeService.addEmployee(emp);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getDetailsEmployee(@PathVariable("id") Integer id) throws EmployeeException{
		Employee employee = employeeService.getDetailsOfEmployee(id);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Integer id) throws EmployeeException{
		Employee employee = employeeService.deleteEmployee(id);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("employees/{id}")
	public ResponseEntity<List<Task>> listOfTask(@PathVariable("id") Integer id) throws EmployeeException, TaskException{
		
		List<Task> list = employeeService.listOfTasks(id);
		
		return new ResponseEntity<List<Task>>(list, HttpStatus.ACCEPTED);
	}
	
	
	
}
