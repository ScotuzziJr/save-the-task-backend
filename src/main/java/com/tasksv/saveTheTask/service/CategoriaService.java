package com.tasksv.saveTheTask.service;

import com.tasksv.saveTheTask.repo.Categoria;

import javax.transaction.InvalidTransactionException;
import java.util.List;
import java.util.Optional;

public interface CategoriaService
{
    public Optional<Categoria> getCategoriaPorId(Long id);
    public List<Categoria> getCategorias();
    public Categoria inserir(Categoria categoria);
    public void editar(Categoria categoria);
    public void excluir(Long id) throws InvalidTransactionException;
}
