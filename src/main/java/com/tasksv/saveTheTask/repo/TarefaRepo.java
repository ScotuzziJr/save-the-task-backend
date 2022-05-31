package com.tasksv.saveTheTask.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TarefaRepo extends JpaRepository<Tarefa, Long>
{
    Tarefa findById(String id);
    Tarefa findByTitulo(String titulo);
    @Modifying
    @Query(
            "update Tarefa t set t.titulo = ?1, t.descricao = ?2, t.prioridade = ?3, t.categoria_id = ?4, t.completada = ?5, where t.id = ?6"
    )
    void setTarefaInfo(String titulo, String descricao, int prioridade, int categoriaId, boolean completada, int id);
}
