package com.tasksv.saveTheTask.repo;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepo extends JpaRepository<Categoria, Long> {
    Categoria findById(String id);
    Categoria findByNome(String nome);
}
