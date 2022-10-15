package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.exception.EmployeeException;
import com.example.demo.exception.TaskException;
import com.example.demo.module.Task;

public interface TaskService {

	public Task addTask(Task task, Integer id) throws EmployeeException;
	
	public List<Task> tasksBetweenDates(LocalDate startDate, LocalDate endDate) throws TaskException;
	
	public Task updateTask(Integer id) throws TaskException;
	
	public Task deleteTask(Integer id) throws TaskException;
	
}
