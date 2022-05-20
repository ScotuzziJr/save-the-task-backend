package com.tasksv.tasksv.model;

public class Tarefa
{
    private int id;
    private String titulo;
    private String descricao;
    private boolean completada;
    private int prioridade;
    private Categoria categoria;
    private Usuario usuario;

    public Tarefa(int id, String titulo, String descricao, boolean completada, int prioridade, Categoria categoria, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.completada = completada;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.usuario = usuario;
    }
}
