package com.qa.AccountManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.catalina.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.qa.AccountManager.Entity.User;

public class CustomUserDetails implements UserDetails {
	
	private String userName;
	private String passWord;
	public Collection<? extends GrantedAuthority> authorities;
	
	
	public CustomUserDetails (User byUserName ) {
		this.userName = byUserName.getUserName();
		this.passWord = byUserName.getPassWord();
		
		List<GrantedAuthority> auths = new ArrayList<>();
		for (com.qa.AccountManager.Entity.Role role : byUserName.getRoles())
			auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
		this.authorities = auths;
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passWord;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
