package com.fideljose.model;

import java.beans.Transient;
import java.util.List;

public class Client {

	private Integer id;
	private String fullName;
	private String address;
	private String cellPhone;
	
	public Client() {
		super();
	}
	public Client(String fullName, String address, String cellPhone) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.cellPhone = cellPhone;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
