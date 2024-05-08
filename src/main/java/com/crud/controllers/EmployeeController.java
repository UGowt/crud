package com.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepository;
@CrossOrigin(origins="*")
@RestController
public class EmployeeController {
@Autowired
EmployeeRepository er;

@PostMapping(value="/postAll")
public String postAll(@RequestBody List<Employee> a) {
	er.saveAll(a);
	return "post successfully";
 }
@PostMapping(value="post")
public void post(@RequestBody Employee a) {
	er.save(a);
	
}
@GetMapping(value="get")
public List<Employee> getAll() {
	return er.findAll();
 }

}
