package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Task;

public interface TaskDao extends JpaRepository<Task, Integer>{
    
	@Query("select t from Task t where starttime>=?1 and endtime<=?2")
	public List<Task> getbetweendates(LocalDate starttime, LocalDate endtime);
	
}
