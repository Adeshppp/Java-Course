package com.demo.DemoHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	
	private String fName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	@Override
	public String toString() {
		return "StudentName [fName=" + fName + ", lName=" + lName + ", mName=" + mName + "]";
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	private String mName;

}
