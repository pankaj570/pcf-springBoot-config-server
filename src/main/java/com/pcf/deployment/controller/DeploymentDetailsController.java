package com.pcf.deployment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deployment")
public class DeploymentDetailsController {
	
	@Autowired
	private DeploymentDetails deploymentDetails;
	
	@GetMapping("/details")
	public DeploymentDetails getEmployeeDetails() {
	
		System.out.println("pankaj1 :::"+deploymentDetails);
		return deploymentDetails;
	}
	
	@GetMapping("/test")
	public String getMessage() {
	
		System.out.println("pankaj2 :::"+deploymentDetails);
		return "Hi Test Message !";
	}

}
