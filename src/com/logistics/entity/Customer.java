package com.logistics.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {

	private int cId;
	private String name;
	private String pwd;
	// 给属性添加SET及GET方法	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Customer(int cId, String name, String pwd) {
		super();
		this.cId = cId;
		this.name = name;
		this.pwd = pwd;
	}
	public Customer(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	public Customer() {
		super();
	}
		
}
