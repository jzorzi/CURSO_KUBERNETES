package com.dottech.springcloud.msvc.usuarios.repositories;

import com.dottech.springcloud.msvc.usuarios.models.entitiy.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
