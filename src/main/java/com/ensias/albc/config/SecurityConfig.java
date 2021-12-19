package com.ensias.albc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	protected SecurityConfig() {
		super();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		super.configure(web);
	}
	
	@Override 
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
        .antMatchers("/").permitAll()
        .and()
        .csrf().disable().formLogin()
        .loginPage("/")
        .defaultSuccessUrl("/Home")
        .usernameParameter("username")
        .passwordParameter("password")
        .and()
        .logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/").and()
        .exceptionHandling();
	}
}