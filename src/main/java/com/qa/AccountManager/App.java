package com.qa.AccountManager;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.UserDetailsServiceConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.qa.AccountManager.Entity.Role;
import com.qa.AccountManager.Entity.User;
import com.qa.AccountManager.Repositories.UserRepository;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @Autowired
    public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository) throws Exception {
    	if (repository.count() == 0)
    		repository.save(new User("user", "user", Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));

    	builder.userDetailsService(new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
				// TODO Auto-generated method stub
				return new CustomUserDetails (repository.findByUserName(arg0));
			}
    	
    	});
    }
}
