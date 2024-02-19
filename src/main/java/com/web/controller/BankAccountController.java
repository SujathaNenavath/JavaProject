package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.entity.BankAccount;
import com.web.entity.BankClose;
import com.web.entity.BankTransfer;
import com.web.service.BankServiceImp;
@Controller
public class BankAccountController {
	@Autowired
	
	private BankServiceImp service;

	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("/new")
	public String new_account()
	{
		return "new_account";
	}
	@RequestMapping("/register")
	public String saveMarks(@ModelAttribute BankAccount account,ModelMap map,@RequestParam double amount )
	{
		BankAccount s=service.saveAccount(account, amount);
		return "success";
	}
	@RequestMapping("/balance")public String view(ModelMap model) {
		BankAccount dobModel=new BankAccount(); model.put("models", dobModel);
		 return "balancesuccess"; }
		@RequestMapping("/checkBalsuccess")public String viewDetails(ModelMap model,@RequestParam long account_Number,String name, String password) {
			BankAccount entity=service.viewAccount(account_Number,name,password); 
			model.put("first", entity);
		 return "balance";
		 }
		 
		@RequestMapping("/deposit") 
		public String deposit(ModelMap model) {
			BankAccount bobmodel=new BankAccount(); 
			model.put("deposit", bobmodel);
		   return "deposit";
		   }
		
		@RequestMapping("/depoBal")public String depositStatus(BankAccount entity,@RequestParam long account_Number,String name, String password, double amount,ModelMap model) {
			BankAccount bobEntity=service.depositAmount(entity,account_Number,name,password,amount,model);
		 String message=null; 
		 if(bobEntity!=null)
		 {  message="Amount Deposited successfully.............";
		 } else {
		  message="Your Account Is Inactive"; }
		 model.put("depositstatus",message); 
		 return "depositsucces";
		}
		@RequestMapping("/withdraw")
		public String withdraw(ModelMap model) {
			BankAccount bobModel=new BankAccount();
			model.put("withdraw", bobModel);
			  return "withdraw";
			  }
			@RequestMapping("/withdraBal")
			public String viewWithdrawDetails(BankAccount entity,@RequestParam long account_Number, String name, String password, double amount,ModelMap model) {
				BankAccount bobentity=service.withdrawlAmount(entity,account_Number,name,password,amount); 
			 if(bobentity!=null) {
			  
			 return "withdrawsuccess";
			 }
			 else {  
				
			 } 
			return 	"redirect:/withdraw";	
			}
			@RequestMapping("/transfer")public String transfer(ModelMap model,BankTransfer transfer) {
				BankTransfer bobtransfer=new BankTransfer(); 
				model.put("transfer", bobtransfer);
				 return "transfer";
				 }
				@RequestMapping("/transBal")
				public String viewDetails(BankAccount entity,@RequestParam long account_Number, String name, String password, long target_Account_Number, double amount,ModelMap model) {
					BankAccount bobEntity=service.transferAmount(entity,account_Number,name,password,target_Account_Number,amount);
				 String message=null; 
				 if(bobEntity!=null)
				 {  
					 message="Amount Transferred successfully";
				 }
				 
				else if(bobEntity==null)
				 {
					message="Amount Transfer failed";
				 } 
				 model.put("transferstatus",message);
				 return "transferstatus";    
             }
				@RequestMapping("/close")
				public String closeAccount(ModelMap model,BankClose cmobobaccclose){
					BankClose bobclosemodel=new BankClose(); 
					model.put("close", bobclosemodel);
				   return "closeac"; 
				}@RequestMapping("/closeaccount")
				public String closeAccount(BankClose close,BankAccount entity,@RequestParam long account_number, String name, String password,ModelMap model) { 
					BankAccount bobcloseAcc=service.closeAccount(close,entity,account_number,name,password);
				 
				 if(bobcloseAcc!=null) {
				 return "closesuccess";
				  }
				 else {  
					 return "closeac"; 
				 }
      }
}
  


