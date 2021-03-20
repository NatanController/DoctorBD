package ifrn.pi.doctorbd.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ifrn.pi.doctorbd.Modelos.CasaSaude;
import ifrn.pi.doctorbd.Repositories.CasaSaudeRepository;


public class CustonUserDetailsServiceCasaSaude implements UserDetailsService { 
	
	@Autowired
	private CasaSaudeRepository casaSaudeRepository;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CasaSaude casasaude = casaSaudeRepository.findBycnpj(username);

		if (casasaude == null) {


			throw new UsernameNotFoundException("Medico não encontrado");
		}

		return casasaude;
	}
}


