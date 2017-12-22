package com.tcs.klm.poc.api.aitest.controller;

import com.tcs.klm.poc.api.aitest.domain.Employee;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/employee/details", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class SimpleAPIController {

	@GetMapping
	public ResponseEntity getEmployee() {
		Employee employee = new Employee();
		employee.setId(1l);
		employee.setFirstName("first");
		employee.setLastName("last");
		employee.setAge(30);
		employee.setDept("xyz");

		return new ResponseEntity<>(employee, OK);
	}

}