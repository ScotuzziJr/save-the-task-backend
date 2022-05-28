package com.tasksv.saveTheTask.service;
import com.tasksv.saveTheTask.repo.Tarefa;
import java.util.ArrayList;

public interface TarefaService
{
    // assinatura dos métodos
    public Tarefa getTarefaPorId();
    public ArrayList<Tarefa> getTarefas();
    public void inserir(Tarefa tarefa);
    public Tarefa editar(Tarefa tarefa);
    public void excluir(int id);
}
