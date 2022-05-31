package com.tasksv.saveTheTask.service;

import com.tasksv.saveTheTask.repo.Categoria;
import com.tasksv.saveTheTask.repo.CategoriaRepo;
import com.tasksv.saveTheTask.repo.Tarefa;
import com.tasksv.saveTheTask.repo.TarefaRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CategoriaServiceImplementation implements CategoriaService {
    private final CategoriaRepo categoriaRepo;
    private final TarefaRepo tarefaRepo;

    @Override
    public Categoria getCategoriaPorId(int id)
    {
        log.info("Pegando categoria {}", id);
        return categoriaRepo.findById(String.valueOf(id));
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

    public void excluir(int id)
    {
        List<Tarefa> tarefas = tarefaRepo.findAll();
        for (Tarefa t: tarefas) {
            if (t.getCategoria().getId() == id) {
                t.setCategoria(new Categoria(-1, "Sem categoria", "#ffffff"));
            }
        }

        tarefaRepo.saveAll(tarefas);
        categoriaRepo.deleteById((long) id);
    }
}
