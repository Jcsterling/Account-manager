package com.qa.AccountManager.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.qa.AccountManager.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
	
	
	
	

}
