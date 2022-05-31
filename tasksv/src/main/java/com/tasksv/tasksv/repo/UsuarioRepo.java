package com.tasksv.tasksv.repo;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo implements JpaRepository<Usuario, Long>
{
    Usuario findById(String id);
    Usuario findByNome(String nome);
}