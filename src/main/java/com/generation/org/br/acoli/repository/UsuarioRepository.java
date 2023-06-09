package com.generation.org.br.acoli.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.org.br.acoli.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findById(String usuario);
	public Optional<Usuario> findByUsuario(String usuario);

}
