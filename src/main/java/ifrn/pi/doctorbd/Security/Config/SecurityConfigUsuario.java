package ifrn.pi.doctorbd.Security.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ifrn.pi.doctorbd.Security.CustonUserDetailsServiceUsuario;

public class SecurityConfigUsuario { 
	
	@Autowired
	private CustonUserDetailsServiceUsuario detailsService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {

		builder.userDetailsService(detailsService).passwordEncoder(new BCryptPasswordEncoder ());
	}

	public BCryptPasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}
	
	
	
	
	
	

}
