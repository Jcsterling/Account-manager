package com.qa.AccountManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.qa.AccountManager.Repositories.AccountRepository;
import com.qa.AccountManager.Entity.Account;



@Service
public class ServiceAccount {
	
	@Autowired
	private AccountRepository AccountRepo;
	
	public List<Account> getAllAccounts(){
		return AccountRepo.findAll();
		
	
	}

	public void insert(Account account) {
		AccountRepo.save(account);
		// TODO Auto-generated method stub
		
	}

}
