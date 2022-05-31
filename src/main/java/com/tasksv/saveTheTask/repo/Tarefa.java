package com.tasksv.saveTheTask.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private String descricao;
    private boolean completada;
    private int prioridade;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;
}
