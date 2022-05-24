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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getCompletada(){
        return this.completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}