package com.tasksv.saveTheTask.api;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.tasksv.saveTheTask.repo.Tarefa;
import com.tasksv.saveTheTask.service.TarefaService;
import com.tasksv.saveTheTask.service.TarefaServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor

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
