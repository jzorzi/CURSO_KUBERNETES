package com.dottech.springcloud.msvc.usuarios.repositories;

import com.dottech.springcloud.msvc.usuarios.entitiy.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);
}
