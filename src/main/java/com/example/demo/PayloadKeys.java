package com.example.demo;

public class PayloadKeys {

	private String auth;
	private String p256dh;
	public PayloadKeys(String auth, String p256dh) {
		super();
		this.auth = auth;
		this.p256dh = p256dh;
	}
	public PayloadKeys() {
		super();
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getP256dh() {
		return p256dh;
	}
	public void setP256dh(String p256dh) {
		this.p256dh = p256dh;
	}
	
	
}
