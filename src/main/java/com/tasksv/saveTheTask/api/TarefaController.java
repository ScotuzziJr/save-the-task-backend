package com.tasksv.saveTheTask.api;

import com.tasksv.saveTheTask.repo.Tarefa;
import com.tasksv.saveTheTask.service.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TarefaController {
    private final TarefaService tarefaService;
    @GetMapping("/tarefas")
    public ResponseEntity<List<Tarefa>> getTarefas() {
        return ResponseEntity.ok().body(tarefaService.getTarefas());
    }

    @GetMapping("/tarefas/{id}")
    public ResponseEntity<Tarefa> getTarefaPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(tarefaService.getTarefaPorId(id).orElse(null));
    }

    @PostMapping("/tarefas")
    public ResponseEntity<Tarefa> inserir(@RequestBody Tarefa tarefa) {
        URI uri = URI.create(
                ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/tarefas").toUriString()
        );
        return ResponseEntity.created(uri).body(tarefaService.inserir(tarefa));
    }

    @PutMapping("/tarefas/{id}")
    public ResponseEntity<?> editar(@RequestBody Tarefa tarefa, @PathVariable("id") Long id) {
        tarefa.setId(id);
        tarefaService.editar(tarefa);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/tarefas/{id}")
    public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
        tarefaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
