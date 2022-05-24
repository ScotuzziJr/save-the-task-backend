package com.tasksv.tasksv.api;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.tasksv.tasksv.model.Tarefa;
import com.tasksv.tasksv.service.TarefaService;
import com.tasksv.tasksv.service.TarefaServiceImplementation;
import org.springframework.http.ResponseEntity;

public class TarefaController
{
    // métodos
    public ResponseEntity<ArrayList<Tarefa>> getTarefas()
    {

        return null;
    }

    public ResponseEntity<Tarefa> getTarefaPorId()
    {

        return null;
    }

    public ResponseEntity<Tarefa> inserir(Tarefa tarefa)
    {

        return null;
    }

    public ResponseEntity<Tarefa> editar(Tarefa tarefa)
    {

        return null;
    }

    public ResponseEntity<Tarefa> excluir(int id)
    {

        return null;
    }
}
