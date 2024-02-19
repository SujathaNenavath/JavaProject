package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.entity.BankAccount;
import com.web.entity.BankClose;
import com.web.repository.BankAccountRepo;
@Service
public   class BankServiceImp implements BankService {
@Autowired
	private BankAccountRepo repo;
	public BankAccount saveAccount(BankAccount account,double amount) {
		double previous_Balance=0;  
		double current_Balance=amount;
		account.setPreviousBal(previous_Balance);  
		account.setCurrentBal(current_Balance);
		  String status="Active";  account.setStatus(status);
		  
		BankAccount save=repo.save(account);
		return save;		
	}
	@Override
	public BankAccount viewAccount(long account_Number, String name, String password) {
		BankAccount entity=repo.findById(account_Number).get();
		  if(name.equals(entity.getName())&&password.equals(entity.getPassword())) {    
			  return entity;
		  }  else {
		  
			  return null;
		  }
	}
	
	@Override
	public BankAccount depositAmount(BankAccount account, long account_Number, String name, String password,
			double amount, ModelMap map) {
		BankAccount entity1=repo.findById(account_Number).get();
		 if(entity1.getStatus().equals("Active")) { 
		if(name.equals(entity1.getName())&&password.equals(entity1.getPassword())) {
		    double previous_Balance=entity1.getCurrentBal();    
		    double current_Balance=entity1.getCurrentBal()+amount;
		    entity1.setPreviousBal(previous_Balance);    
		    entity1.setCurrentBal(current_Balance);

		   }   
		  BankAccount entity2= repo.save(entity1);
		   return entity2;  }
		  else {
		   return  null;
		  }		
	}
	@Override
	public BankAccount withdrawlAmount(BankAccount account, long account_Number, String name, String password,
			double amount) {
					 BankAccount entity1=repo.findById(account_Number).get();  
					 if(entity1.getStatus().equals("Active")) {
			   if(name.equals(entity1.getName())&&password.equals(entity1.getPassword())) {    
				   double previous_Balance=entity1.getCurrentBal();
			        double current_Balance=entity1.getCurrentBal()-amount;    
			      entity1.setPreviousBal(previous_Balance);
			        entity1.setCurrentBal(current_Balance);
			   }   
			   BankAccount entity3=repo.save(entity1);
			   return entity3;  
			   }
			  else {   
				  return  null;
			  }
		 }
	
	 @Override public BankAccount transferAmount(BankAccount entity,@RequestParam long account_Number,String name, String password, long target_Account_Number, double amount) {
		 BankAccount entity1=repo.findById(account_Number).get();   
		 BankAccount entity3=repo.findById(target_Account_Number).get();
		 BankAccount entity4=new BankAccount();  
		  if (entity3.getAccount_Number()==(target_Account_Number)&&entity1.getAccount_Number()==(account_Number)) {
		   double current_Balance=entity1.getCurrentBal();   
		   current_Balance=current_Balance-amount;
		   double current_Balance_Target=entity3.getCurrentBal();  
		   current_Balance_Target=current_Balance_Target+amount;
		   entity1.setCurrentBal(current_Balance_Target);   
		   entity3.setCurrentBal(current_Balance_Target);
		   entity4=repo.save(entity1);   
		   entity4=repo.save(entity3);
		  }
		  return entity4;
		 }
	@Override
	public BankAccount closeAccount(BankClose close, BankAccount account, long account_number, String name,
			String password) {
		BankClose close11=new BankClose();
		 BankAccount entity3=repo.findById(account_number).get(); 
		  if(account_number==entity3.getAccount_Number()&&name.equals(entity3.getName())&&password.equals(entity3.getPassword())) {   
			  String status="Inactive";
		   entity3.setStatus(status);   
		   return  repo.save(entity3);
		  }
		  else {   
			  return null;
		  }
	} 
	  }
	
	 
	

