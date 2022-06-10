package com.tasksv.saveTheTask.service;

import com.tasksv.saveTheTask.repo.Categoria;
import com.tasksv.saveTheTask.repo.CategoriaRepo;
import com.tasksv.saveTheTask.repo.Tarefa;
import com.tasksv.saveTheTask.repo.TarefaRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.InvalidTransactionException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CategoriaServiceImplementation implements CategoriaService {
    private final CategoriaRepo categoriaRepo;
    private final TarefaRepo tarefaRepo;

    @Override
    public Optional<Categoria> getCategoriaPorId(Long id)
    {
        log.info("Pegando categoria {}", id);
        return categoriaRepo.findById(id);
    }

    @Override
    public List<Categoria> getCategorias()
    {
        log.info("Pegando todas as categorias");
        return categoriaRepo.findAll();
    }

    @Override
    public Categoria inserir(Categoria categoria)
    {
        log.info("Salvando categoria {}", categoria.getNome());
        return categoriaRepo.save(categoria);
    }

    @Override
    public void editar(Categoria categoria)
    {
        log.info("Editando categoria {}", categoria.getNome());
        categoriaRepo.setCategoriaInfo(
                categoria.getNome(),
                categoria.getCor(),
                categoria.getId()
        );
    }

    public void excluir(Long id) throws InvalidTransactionException {
        Optional<Categoria> toBeDeleted = categoriaRepo.findById(id);
        if(toBeDeleted.isPresent()) {
            log.info("Tentando excluir a categoria {}", categoriaRepo.findById(id));
            List<Tarefa> tarefas = tarefaRepo.findAll();
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getCategoria().getId().equals(id)) {
                    log.info("Erro: não foi possível deletar a categoria - A categoria esta relacionada a tarefa '{}'", tarefa.getTitulo());
                    throw new InvalidTransactionException(
                            "A categoria esta relacionada a tarefa " + tarefa.getTitulo()
                    );
                }
            }
            log.info("Nenhuma tarefa atrelada com esta categoria!");
            categoriaRepo.deleteById(id);
        }
        else{
            log.info("Nenhuma categoria foi localizada!");
        }
    }
}
