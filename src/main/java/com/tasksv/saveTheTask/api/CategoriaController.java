package com.tasksv.saveTheTask.api;

import com.tasksv.saveTheTask.repo.Categoria;
import com.tasksv.saveTheTask.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoriaController
{
    private final CategoriaService categoriaService;
    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> getCategorias()
    {
        return ResponseEntity.ok().body(categoriaService.getCategorias());
    }

    @GetMapping("/categorias/{id}")
    public ResponseEntity<Categoria> getCategoriaPorId(@PathVariable("id") int id)
    {
        return ResponseEntity.ok().body(categoriaService.getCategoriaPorId(id));
    }

    @PostMapping("/categorias")
    public ResponseEntity<Categoria> inserir(@RequestBody Categoria categoria)
    {
        URI uri = URI.create(
                ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/categorias").toUriString()
        );
        return ResponseEntity.created(uri).body(categoriaService.inserir(categoria));
    }

    @PutMapping("/categorias/{id}")
    public ResponseEntity<?> editar(@RequestBody Categoria categoria, @PathVariable("id") int id)
    {
        categoria.setId(id);
        categoriaService.editar(categoria);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/categorias/{id}")
    public ResponseEntity<?> excluir(@PathVariable("id") int id)
    {
        categoriaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
