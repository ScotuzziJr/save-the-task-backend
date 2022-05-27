package com.tasksv.tasksv.repo;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepo implements JpaRepository<Categoria, Long>
{
    Categoria findById(String id);
    Categoria findByNome(String nome);
}