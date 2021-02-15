/**
 * 
 */
package com.melalietest.rana.assessment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @author anitamarsafira
 *
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	// Create 2 users for demo
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("hungry12345678").roles("USER")
                .and()
                .withUser("admin").password("hungry12345678").roles("USER", "ADMIN");

    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/purchase").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/purchase").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

}
