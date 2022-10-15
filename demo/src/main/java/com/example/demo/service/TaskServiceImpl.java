package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeException;
import com.example.demo.exception.TaskException;
import com.example.demo.module.Employee;
import com.example.demo.module.Task;
import com.example.demo.repository.EmployeeDao;
import com.example.demo.repository.TaskDao;

@Service
public class TaskServiceImpl implements TaskService{
    
	@Autowired
	private TaskDao taskdao;
	
	@Autowired
	private EmployeeDao empdao;

	@Override
	public Task addTask(Task task, Integer id) throws EmployeeException {
		
		Optional<Employee> opt = empdao.findById(id);
		
		if(!opt.isPresent()) {
			throw new EmployeeException("Enter the correct employee id to create and assign the task");
		}
		Employee employee =opt.get();
		task.setEmployee(employee);
		
		Task newtask = taskdao.save(task);
		employee.getListOfTasks().add(task);
		empdao.save(employee);
		return newtask;
	}

	@Override
	public List<Task> tasksBetweenDates(LocalDate startDate, LocalDate endDate) throws TaskException {
		
		List<Task> list = taskdao.getbetweendates(startDate, endDate);
		if(list.size()==0) {
			throw new TaskException("No task is found between these dates");
		}
		
		return list;
	}

	@Override
	public Task updateTask(Integer id) throws TaskException {
		Optional<Task> opt = taskdao.findById(id);
		if(!opt.isPresent()) {
			throw new TaskException("No task is found with this id:"+" "+id);
		}
		Task newtask = taskdao.save(opt.get());
		return newtask;
	}

	@Override
	public Task deleteTask(Integer id) throws TaskException {
		Optional<Task> opt = taskdao.findById(id);
		if(!opt.isPresent()) {
			throw new TaskException("No task is found with this id:"+" "+id);
		}
		Task deleted = opt.get();
		Employee employee=deleted.getEmployee();
		employee.getListOfTasks().remove(deleted);
		empdao.save(employee);
		taskdao.delete(deleted);
		return deleted;
	}
	
	
	
	
}
