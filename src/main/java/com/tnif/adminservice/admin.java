package com.tnif.adminservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class admin {
	@Id
	@Column(name="cid")
	protected int cid;
	@Column(name="department")
	private String department;
	@Column(name="teacher")
	private String teacher;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public admin()
	{
		super();
	}
	public admin(int cid,String department,String teacher)
	{
		super();
		this.cid=cid;
		this.department=department;
		this.teacher=teacher;
	}
	@Override
	public String toString()
	{
		return "admin[cid="+cid+"department="+department+"teacher="+teacher+ "]";
		
	}
	
	
}
