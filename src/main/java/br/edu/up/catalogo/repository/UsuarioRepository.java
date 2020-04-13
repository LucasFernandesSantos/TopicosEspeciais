package br.edu.up.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.catalogo.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
