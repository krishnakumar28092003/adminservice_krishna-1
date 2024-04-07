package com.tnif.adminservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController



public class Admincontroler {
	@Autowired
	private Adminservice service;
	
	@PostMapping("/Adminservice")
	public void add(@RequestBody admin cust)
	{
		service.insertRecord(cust);
	}
	
	
	@GetMapping("/Adminservice")
	public List<admin> ShowAll()
	{
		return service.getAllRecords();
	}

	
	@GetMapping("/Adminservice/{id}")
	public admin getadminById(@PathVariable Integer id)
	{
		return service.getadminById(id);
	}
	
	@DeleteMapping("/Adminservice/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		service.deleteadmin(id);
	}
	
	@PutMapping("/Adminservice/{id}")
	public ResponseEntity<String> updateadmin(@PathVariable Integer id,@RequestBody admin updatedadmin)
	{
		service.updateadmin(id,updatedadmin);
		return ResponseEntity.ok("Admin updated Successfully");
	}
		
}



