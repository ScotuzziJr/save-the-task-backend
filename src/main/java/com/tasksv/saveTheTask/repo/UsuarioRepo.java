package com.tasksv.saveTheTask.repo;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>
{
    Usuario findById(String id);
    Usuario findByNome(String nome);
}