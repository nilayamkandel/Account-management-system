package com.model;

public class Account {
	private int id;
	private String userName;
	private int accountNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Account( String userName, int accountNo) {
		super();
		
		this.userName = userName;
		this.accountNo = accountNo;
	}
}
