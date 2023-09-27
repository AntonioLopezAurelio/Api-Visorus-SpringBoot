package com.apivisorus.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.apivisorus.model.entity.Categoria;

public interface ICategoria {

    Categoria save(Categoria categoria);

    Categoria findById(Integer id);

    void delete(Categoria categoria);

    List<Categoria> findCategorias();

    List<Categoria> findCategoriaPalabraClave(String busqueda);
    
}
