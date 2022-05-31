package com.tasksv.saveTheTask.service;
import com.tasksv.saveTheTask.repo.Tarefa;
import java.util.ArrayList;
import java.util.List;

public interface TarefaService
{
    public Tarefa getTarefaPorId(int id);
    public List<Tarefa> getTarefas();
    public Tarefa inserir(Tarefa tarefa);
    public void editar(Tarefa tarefa);
    public void excluir(int id);
}
