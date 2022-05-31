package com.tasksv.saveTheTask.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepo extends JpaRepository<Categoria, Long> {
    Categoria findById(String id);
    Categoria findByNome(String nome);

    @Modifying
    @Query(
            "update Categoria c set c.nome = ?1, c.cor = ?2 where c.id = ?3"
    )
    void setCategoriaInfo(String nome, String cor, int id);
}
