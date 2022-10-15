package com.example.demo.module;

import javax.validation.constraints.NotNull;

public class EmployeeDTO {

	
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
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(@NotNull String empName, @NotNull String email, @NotNull String state, @NotNull String mobile,
			@NotNull String designation) {
		super();
		this.empName = empName;
		this.email = email;
		this.state = state;
		this.mobile = mobile;
		this.designation = designation;
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
	
	
	
	
}
