package com.tasksv.saveTheTask.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TarefaRepo extends JpaRepository<Tarefa, Long>
{
    Tarefa findById(int id);
    Tarefa findByTitulo(String titulo);
    @Modifying
    @Query(
            value = "UPDATE Tarefa set titulo = ?1, descricao = ?2, prioridade = ?3, categoria_id = ?4, completada = ?5 where id = ?6",
            nativeQuery = true
    )
    void setTarefaInfo(String titulo, String descricao, int prioridade, int categoriaId, boolean completada, int id);
}
