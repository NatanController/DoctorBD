package ifrn.pi.doctorbd.WebSecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{ 

	@Autowired
	protected void configure(HttpSecurity http) throws Exception {

		http
		.authorizeRequests() 
		 .antMatchers("/").permitAll() 
		  .antMatchers("/cadastro").permitAll()
		   .antMatchers("/cadastroCasaSaude").permitAll()
		    .antMatchers("/cadastroUsuario").permitAll()
		     .antMatchers("/cadastroMedico").permitAll();    

	}
}