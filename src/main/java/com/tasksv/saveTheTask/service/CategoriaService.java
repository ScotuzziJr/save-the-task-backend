package com.tasksv.saveTheTask.service;

import com.tasksv.saveTheTask.repo.Categoria;

import java.util.List;

public interface CategoriaService
{
    public Categoria getCategoriaPorId(int id);
    public List<Categoria> getCategorias();
    public Categoria inserir(Categoria categoria);
    public void editar(Categoria categoria);
    public void excluir(int id);
}
