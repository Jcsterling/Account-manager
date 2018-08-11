package com.qa.AccountManager.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.AccountManager.Entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

	

	User findByUserName(String username);
}
