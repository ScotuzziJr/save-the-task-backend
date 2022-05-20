package com.tasksv.tasksv.repo;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepo extends JpaRepository<Client, Long>
{
    Client findByEmail(String email);
}

