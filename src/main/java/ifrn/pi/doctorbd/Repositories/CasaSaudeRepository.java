package ifrn.pi.doctorbd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.doctorbd.Modelos.CasaSaude;
import ifrn.pi.doctorbd.Modelos.Medico;

public interface CasaSaudeRepository extends JpaRepository<CasaSaude, Long> {

	CasaSaude findBycnpj(String cnpj);



}
