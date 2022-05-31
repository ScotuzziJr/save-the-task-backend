package com.tasksv.saveTheTask.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepo extends JpaRepository<Categoria, Long> {
    Categoria findById(int id);
    Categoria findByNome(String nome);

    @Modifying
    @Query(
            value = "UPDATE Categoria set nome = ?1, cor = ?2 where id = ?3",
            nativeQuery = true
    )
    void setCategoriaInfo(String nome, String cor, int id);
}
