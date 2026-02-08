package org.dottech.springcloud.msvc.cursos.services;

import org.dottech.springcloud.msvc.cursos.models.Usuario;
import org.dottech.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {

    // logica de negocios de persistencia de datos
    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);

    Optional<Curso> porIdConUsuarios(Long id);

    void eliminarCursoUsuarioPorId(Long id);

    // logica de negocios de para usar entre microservicios
    Optional<Usuario> asignarUsuaio(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);

}