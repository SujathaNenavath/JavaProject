package com.web.service;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.entity.BankAccount;
import com.web.entity.BankClose;



public interface BankService{
	public BankAccount saveAccount(BankAccount account,double amount);
	public BankAccount viewAccount(long account_Number,String name,String password);
	public BankAccount depositAmount(BankAccount account,@RequestParam long account_Number, String name, String password, double amount,ModelMap map);
	public BankAccount withdrawlAmount(BankAccount account,@RequestParam long account_Number, String name, String password,double amount);
	public BankAccount transferAmount(BankAccount account,@RequestParam long account_Number, String name, String password, long target_Account_Number, double amount);
	public BankAccount  closeAccount(BankClose close,BankAccount account,@RequestParam long account_number, String name, String password);
}

