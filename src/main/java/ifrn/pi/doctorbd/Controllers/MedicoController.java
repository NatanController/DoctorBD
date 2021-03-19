package ifrn.pi.doctorbd.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import ifrn.pi.doctorbd.Repositories.MedicoRepository;
import ifrn.pi.doctorbd.Modelos.Medico;

@Controller
public class MedicoController {
	
	
	@Autowired
	private MedicoRepository mr; 
	
	@PostMapping("/cadastroMedico")
	public String envioMedico(Medico medico) {

		System.out.println(medico);
		mr.save(medico);
		return "login";
	}
	


}

