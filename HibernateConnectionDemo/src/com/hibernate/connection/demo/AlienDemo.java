package com.hibernate.connection.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "alien_table")
public class AlienDemo {
	
	@Id
	private int aid;
	//@Transient //Data will not get stored
	private AlienName aname;
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "AlienDemo [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	

}
