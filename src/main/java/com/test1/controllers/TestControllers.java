package com.test1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

	@GetMapping("/test")
    public String home() {
		System.out.print("test Called aa");
		return "HI";
    }
}
