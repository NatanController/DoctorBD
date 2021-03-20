package ifrn.pi.doctorbd.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ifrn.pi.doctorbd.Modelos.Medico;
import ifrn.pi.doctorbd.Repositories.MedicoRepository;

public class CustonUserDetailsServiceMedico implements UserDetailsService { 
	
	@Autowired
	private MedicoRepository medicoRepository;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Medico medico = medicoRepository.findBycpf(username);

		if (medico == null) {


			throw new UsernameNotFoundException("Medico não encontrado");
		}

		return medico;
	}
	
	
	
	
	
	

}
