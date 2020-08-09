package cl.cpoblete.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.cpoblete.model.entity.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {
//	
}
