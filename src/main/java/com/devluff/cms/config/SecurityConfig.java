package com.devluff.cms.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/css/**", "/js/**", "image/**", "/fonts/**", "lib/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/admin/login").permitAll()	
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/**").permitAll();
		
		http.formLogin()
        	.loginPage("/admin/login")
        	.loginProcessingUrl("/admin/login")
        	.failureUrl("/login")
        	.defaultSuccessUrl("/admin/member/list", true)
        	.usernameParameter("id")
        	.passwordParameter("password");

		http.logout()
        	.logoutRequestMatcher(new AntPathRequestMatcher("/admin/logout"))
        	.logoutSuccessUrl("/")
        	.invalidateHttpSession(true);
	}
	
}