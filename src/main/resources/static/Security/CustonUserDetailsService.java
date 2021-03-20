package ifrn.pi.doctorbd.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ifrn.pi.doctorbd.Modelos.Usuario;
import ifrn.pi.doctorbd.Repositories.UsuarioRepository;

@Service
public class CustonUserDetailsService implements UserDetailsService  {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findBycpf(username);
		
		if (usuario == null) {
			
			
			throw new UsernameNotFoundException("Usuario não encontrado");
		}

		return usuario;
	}

}
