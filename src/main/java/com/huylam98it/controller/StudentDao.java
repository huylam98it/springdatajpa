package com.huylam98it.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.huylam98it.model.Student;

@Repository(value="studentDao")
public interface StudentDao extends JpaRepository<Student, Integer>{
	
	
}
