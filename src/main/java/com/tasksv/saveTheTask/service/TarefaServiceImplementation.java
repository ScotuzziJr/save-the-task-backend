package com.tasksv.saveTheTask.service;

import com.tasksv.saveTheTask.repo.Tarefa;
import com.tasksv.saveTheTask.repo.TarefaRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TarefaServiceImplementation implements TarefaService {
    private final TarefaRepo tarefaRepo;

    @Override
    public Optional<Tarefa> getTarefaPorId(Long id) {
        log.info("Pegando tarefa {}", id);
        return tarefaRepo.findById(id);
    }

    @Override
    public List<Tarefa> getTarefas() {
        log.info("Pegando todas as tarefas");
        return tarefaRepo.findAll();
    }

    @Override
    public Tarefa inserir(Tarefa tarefa) {
        log.info("Salvando tarefa {}", tarefa.getTitulo());
        return tarefaRepo.save(tarefa);
    }

    @Override
    public void editar(Tarefa tarefa) {
        log.info("Editando tarefa {}", tarefa.getTitulo());
        tarefaRepo.setTarefaInfo(
                tarefa.getTitulo(),
                tarefa.getDescricao(),
                tarefa.getPrioridade(),
                tarefa.getCategoria() == null ? tarefaRepo.getReferenceById(tarefa.getId()).getCategoria().getId() : tarefa.getCategoria().getId(),
                tarefa.isCompletada(),
                tarefa.getDataLimite(),
                tarefa.getId()
        );
    }

    public void excluir(Long id)
    {
        log.info("Tentando deletar a tarefa {}", tarefaRepo.findById(id));
        tarefaRepo.deleteById(id);
    }
}
