package com.example.demo.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.EmployeeException;
import com.example.demo.exception.TaskException;
import com.example.demo.module.Task;
import com.example.demo.module.TaskDTO;
import com.example.demo.service.TaskService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	
	
	@DeleteMapping("/task/{id}")
	public ResponseEntity<Task> createTask(@PathVariable("id") Integer id) throws TaskException{
		
		Task deleted= taskService.deleteTask(id);
		return new ResponseEntity<Task>(deleted, HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/task")
	public ResponseEntity<Task> createTask(@RequestBody TaskDTO task) throws EmployeeException{
		LocalDate startdate =LocalDate.parse(task.getStarttime());
		LocalDate enddate = LocalDate.parse(task.getEndtime());
		System.out.println(startdate);
		System.out.println(enddate);
		Task newtask = new Task();
		newtask.setTitle(task.getTitle());
		newtask.setDescription(task.getDescription());
		newtask.setStarttime(startdate);
		newtask.setEndtime(enddate);
		newtask.setPriority(task.getPriority());
		newtask.setStatus(task.getStatus());
		Task createdtask = taskService.addTask(newtask, task.getEmpId());
		return new ResponseEntity<Task>(createdtask, HttpStatus.OK);
	}
	
	
	@GetMapping("/task")
	public ResponseEntity listOfTask(@RequestParam("startdate") String startdate, @RequestParam("enddate") String enddate) throws TaskException{
		
		LocalDate sdate =LocalDate.parse(startdate);
		LocalDate edate = LocalDate.parse(enddate);
		
		List<Task> list = taskService.tasksBetweenDates(sdate, edate);
		return new ResponseEntity(list, HttpStatus.OK);
		
	}
	
	@PutMapping("/task/{id}")
	public ResponseEntity<Task> updateTask(@RequestBody Task task,@PathVariable("id") Integer id) throws TaskException{
		Task updatedtask = taskService.updateTask(id);
		return new ResponseEntity<Task>(updatedtask, HttpStatus.ACCEPTED);
	}
	
	
	
	
}
