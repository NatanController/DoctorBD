package ifrn.pi.doctorbd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ifrn.pi.doctorbd.Modelos.Medico;
import ifrn.pi.doctorbd.Modelos.Usuario;

public interface MedicoRepository extends JpaRepository<Medico, Long> { 
	
	Medico findBycpf(String cpf);
	

}
