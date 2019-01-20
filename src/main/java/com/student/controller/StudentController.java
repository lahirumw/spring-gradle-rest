package com.student.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;

@RestController
public class StudentController {
    
    @GetMapping("/students/{studentId}")
    @ResponseStatus(HttpStatus.OK)
    public Student get(@PathVariable String studentId) {
	
	return new Student(studentId);
    }
    
    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student post(@Valid @RequestBody Student student) {
	
	return new Student(student);
    }
    
    @PutMapping("/students/{studentId}")
    @ResponseStatus(HttpStatus.OK)
    public Student put(@Valid @RequestBody Student student, @PathVariable String studentId) {
	
	//updateStudent(student);
	return student;
    }
    
    @DeleteMapping("/students/{studentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(@PathVariable String studentId) {
	
	//removeStudent(studentId);
    }

}
