package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
    @Id
	private int id;
	private String name;
	private String spec;
	private int room_no;
	public Doctor() {
		
	}
	
	public Doctor(int id, String name, String spec, int room_no) {
		super();
		this.id = id;
		this.name = name;
		this.spec = spec;
		this.room_no = room_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	

}
