package com.example.demo;

import java.util.Date;

public class PayloadRegister {

	private String endpoint;
	private Date expirationTime;
	private PayloadKeys keys;
	public PayloadRegister(String endpoint, Date expirationTime, PayloadKeys keys) {
		super();
		this.endpoint = endpoint;
		this.expirationTime = expirationTime;
		this.keys = keys;
	}
	public PayloadRegister() {
		super();
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	public PayloadKeys getKeys() {
		return keys;
	}
	public void setKeys(PayloadKeys keys) {
		this.keys = keys;
	} 
	
	
	
}
