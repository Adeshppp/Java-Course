package com.demo.HibernateRelations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student> student = new ArrayList<>();
	
//	@ManyToOne
//	private Student student;
//	
//	@OneToOne
//	private Student student;
	
	
	public int getLid() {
		return lid;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
