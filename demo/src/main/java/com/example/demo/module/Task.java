package com.example.demo.module;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskId;
	private String title;
	private String description;
	private LocalDate starttime;
	private LocalDate endtime;
	private String status;
	private String priority;
	
	@JsonIgnore
	@ManyToOne
	private Employee employee;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public LocalDate getStarttime() {
		return starttime;
	}

	public void setStarttime(LocalDate starttime) {
		this.starttime = starttime;
	}

	public LocalDate getEndtime() {
		return endtime;
	}

	public void setEndtime(LocalDate endtime) {
		this.endtime = endtime;
	}
	
	
	
}
