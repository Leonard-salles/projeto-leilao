package br.com.leilao.leiloesapi.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    Usuario findByUsernameAndPassword(String username, String password);
}
