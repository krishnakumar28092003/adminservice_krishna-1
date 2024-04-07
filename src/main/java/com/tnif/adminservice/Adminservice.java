package com.tnif.adminservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class Adminservice {
	@Autowired
	private Adminrepository repo;
	//Inserting the records to the table in database
	public void insertRecord(admin cust)
	{
		repo.save(cust);
	}
	
	//Show all the records from the table in database
	public List<admin> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public admin getadminById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteadmin(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateadmin(Integer id,admin updateadmin)
	{
		admin existingadmin=repo.findById(id).orElse(null);
		if(existingadmin!=null)
		{
			existingadmin.setCid(updateadmin.getCid());
			existingadmin.setDepartment(updateadmin.getDepartment());
			existingadmin.setTeacher(updateadmin.getTeacher());
			repo.save(existingadmin);
		}
	}

}
