package com.tasksv.tasksv.service;
import com.tasksv.tasksv.model.Tarefa;
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
