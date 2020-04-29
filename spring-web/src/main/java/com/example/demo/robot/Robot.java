package com.example.demo.robot;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Robot {
	
	@Id
	private int rid;
	private String rname;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	@Override
	public String toString() {
		return "robot [rid=" + rid + ", rname=" + rname + "]";
	}
}
