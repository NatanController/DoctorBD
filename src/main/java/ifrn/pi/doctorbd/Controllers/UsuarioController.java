package ifrn.pi.doctorbd.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import ifrn.pi.doctorbd.Repositories.UsuarioRepository;
import ifrn.pi.doctorbd.Modelos.Usuario;

@Controller 
public class UsuarioController { 
	
	@Autowired
	private UsuarioRepository ur; 
	
	@PostMapping("/cadastroUsuario")
	public String envioUsuario(Usuario usuario) {

		System.out.println(usuario);
		ur.save(usuario);
		return "login";
	}
	

}

