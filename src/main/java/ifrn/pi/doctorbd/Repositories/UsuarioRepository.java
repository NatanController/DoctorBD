package ifrn.pi.doctorbd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.doctorbd.Modelos.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
