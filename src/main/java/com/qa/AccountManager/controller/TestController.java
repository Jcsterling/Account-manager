package com.qa.AccountManager.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.qa.AccountManager.Entity.Account;
import com.qa.AccountManager.Service.ServiceAccount;

@RestController
public class TestController {
	
	@Autowired
	private ServiceAccount AccountService;
	
	
	@RequestMapping("/")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
	@GetMapping("/private")
	public String privateArea() {
		return "private";
	}
	
	@GetMapping("/Accounts")
	public List<Account> accounts(){
		
		return AccountService.getAllAccounts();
		
	}
	
	@PostMapping("/Account")
	public void addAccount(@RequestBody Account account) {
		
		if (account.getDateCreated() == null)
			account.setDateCreated(new Date());
		
		
		AccountService.insert(account);
		
	}
	

}
