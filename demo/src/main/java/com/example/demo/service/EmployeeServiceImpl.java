package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeException;
import com.example.demo.exception.TaskException;
import com.example.demo.module.Employee;
import com.example.demo.module.Task;
import com.example.demo.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao empdao;

	@Override
	public Employee addEmployee(Employee employee) {
		
		Employee newemployee=empdao.save(employee);
		return newemployee;
	}

	@Override
	public Employee getDetailsOfEmployee(Integer id) throws EmployeeException {
		
		Optional<Employee> opt= empdao.findById(id);
		if(!opt.isPresent()) {
			throw new EmployeeException("Employee not found with this id:"+" "+id);
		}
		Employee employee=opt.get();
		return employee;
	}

	@Override
	public Employee deleteEmployee(Integer id) throws EmployeeException {
		Optional<Employee> opt= empdao.findById(id);
		if(!opt.isPresent()) {
			throw new EmployeeException("Employee not found with this id:"+" "+id);
		}
		Employee employee=opt.get();
		empdao.delete(employee);
		return employee;
	}

	@Override
	public List<Task> listOfTasks(Integer id) throws EmployeeException, TaskException {
		Optional<Employee> opt= empdao.findById(id);
		if(!opt.isPresent()) {
			throw new EmployeeException("Employee not found with this id:"+" "+id);
		}
		Employee employee=opt.get();
		List<Task> list = employee.getListOfTasks();
		if(list.size()==0) {
			throw new TaskException("Task List is empty");
		}
		return list;
	}

}
