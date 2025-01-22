package com.demo.EagerAndLazyLoadingAndCaching;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//@Table(name="alien_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	
	@Id
	private int aid;
	private String aname;
	@OneToMany(mappedBy="alien", fetch=FetchType.EAGER)
	private Collection<Laptop> laptop = new ArrayList<>();;

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Collection<Laptop> getLaptop() {
		return laptop; 
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", laptop=" + laptop + "]";
	}
	public void setLaptop(Collection<Laptop> laptop) {
		this.laptop = laptop;
	}

}
