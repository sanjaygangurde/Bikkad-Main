package com.BikkadIT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="STUDENT_DETAILS")
public class Student {

	@Id
//	@Column(name="STUDENT_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

//	@Column(name="STUDENT_NAME")
	private String sname;

//	@Column(name="STUDENT_ADDRESS")
	private String saddress;

//	@Column(name="STUDENT_MARKS")
	private int smarks;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", smarks=" + smarks + "]";
	}

	

	

}
