package ifrn.pi.doctorbd.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import ifrn.pi.doctorbd.Modelos.CasaSaude; 
import ifrn.pi.doctorbd.Repositories.CasaSaudeRepository;


@Controller
public class CasaSaudeController {
	
	@Autowired
	private CasaSaudeRepository csr;
	
	
	@PostMapping("/cadastroCasaSaude")
	public String envioCasaSaude(CasaSaude casa_saude) {

		System.out.println(casa_saude);
		csr.save(casa_saude);
		return "login";
	}
	

}
