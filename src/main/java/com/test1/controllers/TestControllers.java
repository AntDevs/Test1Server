package com.test1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test1.services.ExamService;

@RestController
public class TestControllers {

	@Autowired
	ExamService examService;
	
	@GetMapping("/test")
    public Object home() {
		System.out.print("test Called aa");		
		return examService.getExamCreators();
    }
}
