package com.tasksv.saveTheTask.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TarefaRepo extends JpaRepository<Tarefa, Long>
{
    Optional<Tarefa> findById(Long id);

    @Modifying
    @Query(
            value = "UPDATE Tarefa set titulo = ?1, descricao = ?2, prioridade = ?3, categoria_id = ?4, completada = ?5 where id = ?6",
            nativeQuery = true
    )
    void setTarefaInfo(String titulo, String descricao, int prioridade, Long categoriaId, boolean completada, Long id);
}
