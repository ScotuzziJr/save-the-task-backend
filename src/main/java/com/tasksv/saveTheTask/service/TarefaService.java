package com.tasksv.saveTheTask.service;
import com.tasksv.saveTheTask.repo.Tarefa;

import java.util.List;
import java.util.Optional;

public interface TarefaService {
    public Optional<Tarefa> getTarefaPorId(Long id);
    public List<Tarefa> getTarefas();
    public Tarefa inserir(Tarefa tarefa);
    public void editar(Tarefa tarefa);
    public void excluir(Long id);
}
