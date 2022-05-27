package com.tasksv.tasksv.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private Long id;
    private String titulo;
    private String descricao;
    private boolean completada;
    private int prioridade;

    public Tarefa(Long id, String titulo, String descricao, boolean completada, int prioridade)
    {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.completada = completada;
        this.prioridade = prioridade;
    }

//    @Override
//    public String toString()
//    {
//        return "Tarefa{" +
//                "id=" + id +
//                ", nome='" + name +
//                "descricao=" + id + '\'' +
//                '}';
//    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public boolean isCompletada() { return completada; }

    public void setCompletada(boolean completada) { this.completada = completada; }

    public int getPrioridade() { return prioridad; }

    public void setPrioridade(int prioridade) { this.prioridade = prioridade; }
}
