package com.apivisorus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apivisorus.model.entity.Categoria;
import com.apivisorus.service.ICategoria;

@RestController
@RequestMapping("/api/v1")
public class CategoriaController {

    @Autowired
    private ICategoria categoriaService;

    @PostMapping("categoria")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria createCategoria(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }

    @PutMapping("categoria")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria updateCategoria(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }

    @DeleteMapping("categoria/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategoria(@PathVariable Integer id){
        Categoria categoriaDelete = categoriaService.findById(id);
        categoriaService.delete(categoriaDelete);
    }

    @GetMapping("categoria/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Categoria showCategoriaById(@PathVariable Integer id){
        return categoriaService.findById(id);
    }

    @GetMapping("categorias")
    @ResponseStatus(HttpStatus.OK)
    public List<Categoria> showCategorias(){
        return categoriaService.findCategorias();
    }

    @GetMapping("categoriasBusqueda/{palabra}")
    @ResponseStatus(HttpStatus.OK)
    public List<Categoria> showCategoriasBusqueda(@PathVariable String palabra){
        return categoriaService.findCategoriaPalabraClave(palabra);
    }
    
}
