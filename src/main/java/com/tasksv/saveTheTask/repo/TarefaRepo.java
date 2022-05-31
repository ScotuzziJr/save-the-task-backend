package com.tasksv.saveTheTask.repo;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepo extends JpaRepository<Tarefa, Long>
{
    Tarefa findById(String id);
    Tarefa findByTitulo(String titulo);
}
