package ifrn.pi.doctorbd.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ifrn.pi.doctorbd.Modelos.CasaSaude;
import ifrn.pi.doctorbd.Repositories.CasaSaudeRepository ;

@Service
public class CustonUserDetailsServiceCasaSaude implements UserDetailsService { 
	
	
	@Autowired
	private CasaSaudeRepository casaSaudeRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CasaSaude casasaude = casaSaudeRepository.findBycnpj(username);

		if (casasaude == null) {


			throw new UsernameNotFoundException("Casa Saude não encontrado");
		}

		return casasaude;
	} 
	

}
