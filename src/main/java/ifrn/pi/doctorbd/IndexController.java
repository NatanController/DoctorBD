package ifrn.pi.doctorbd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController { 
	
	@RequestMapping("/")
	public String index(){
		
		return "login";
}
	
	@RequestMapping("/cadastro")
	public String pagcadastro(){
		
		return "cadastro";
} 
	
	@RequestMapping("/cadastroUsuario")
	public String pagcadastroUsuario(){
		
		return "cadastroUsuario";
}
	@RequestMapping("/cadastroCasaSaude")
	public String pagcadastroCasaSaude() {
		return "cadastroCasaSaude";
	}
	
	@RequestMapping("/cadastroMedico")
	public String pagcadastroMedico(){
		
		return "cadastroMedico";
}

	
}