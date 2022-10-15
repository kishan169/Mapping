package com.example.demo.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@NotNull
	private String empName;
	@NotNull
	private String email;
	@NotNull
	private String state;
	@NotNull
	private String mobile;
	@NotNull
	private String designation;
	
	@JsonIgnore
	@OneToMany
	private List<Task> listOfTasks=new ArrayList<>();
	
	
	

	public Employee() {
		super();
	}

	
	public Employee(@NotNull String empName, @NotNull String email, @NotNull String state, @NotNull String mobile,
			@NotNull String designation) {
		super();
		this.empName = empName;
		this.email = email;
		this.state = state;
		this.mobile = mobile;
		this.designation = designation;
	}


	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Task> getListOfTasks() {
		return listOfTasks;
	}

	public void setListOfTasks(List<Task> listOfTasks) {
		this.listOfTasks = listOfTasks;
	}
	
	
	
	
	
	
	
	
	
	
}
