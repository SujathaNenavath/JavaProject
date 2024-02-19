package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(BankAccountDetails)
public class BankAccount {
	@Id
	
	long account_Number;
	String name; 
	String password;
    private double amount;
    private String address;
    private String mobileNo;
    private double currentBal;
    private double previousBal;
    private String status;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(long account_Number, String name, String password, double amount, String address,
			String mobileNo, double currentBal, double previousBal, String status) {
		super();
		this.account_Number = account_Number;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobileNo = mobileNo;
		this.currentBal = currentBal;
		this.previousBal = previousBal;
		this.status = status;
	}
	public long getAccount_Number() {
		return account_Number;
	}
	public void setAccount_Number(long account_Number) {
		this.account_Number = account_Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getCurrentBal() {
		return currentBal;
	}
	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}
	public double getPreviousBal() {
		return previousBal;
	}
	public void setPreviousBal(double previousBal) {
		this.previousBal = previousBal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BankAccount [account_Number=" + account_Number + ", name=" + name + ", password=" + password
				+ ", amount=" + amount + ", address=" + address + ", mobileNo=" + mobileNo + ", currentBal="
				+ currentBal + ", previousBal=" + previousBal + ", status=" + status + "]";
	}
	
}
