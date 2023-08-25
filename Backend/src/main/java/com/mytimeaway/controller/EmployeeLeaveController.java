package com.mytimeaway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytimeaway.service.EmployeeLeaveService;

@RestController
@RequestMapping("/api/leaves")
@CrossOrigin
public class EmployeeLeaveController {

	@Autowired
	private EmployeeLeaveService leaveService;

	@Autowired
    private JavaMailSender javaMailSender;

}
