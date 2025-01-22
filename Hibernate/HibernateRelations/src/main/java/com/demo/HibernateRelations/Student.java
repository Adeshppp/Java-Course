package com.demo.HibernateRelations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private int marks;
//	@ManyToMany(mappedBy="student")
//	private List<Laptop> laptop = new ArrayList<>();
	
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop = new ArrayList<>();
	
//	@OneToOne
//	private Laptop laptop;


	public int getRollNo() {
		return rollNo;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


}
