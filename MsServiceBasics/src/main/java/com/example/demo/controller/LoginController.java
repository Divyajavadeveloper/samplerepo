/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vijay Thonupunoori
 *
 */
@RestController
public class LoginController {
	
@RequestMapping("/login")	
public String login()
{
	return "Hello World with GIT Repo Sample";
}
}
