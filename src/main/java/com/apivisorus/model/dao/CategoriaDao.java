package com.apivisorus.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.apivisorus.model.entity.Categoria;

public interface CategoriaDao extends CrudRepository<Categoria, Integer>{

    @Query("SELECT cat FROM Categoria cat WHERE cat.codigo LIKE %?1% OR cat.descripcion LIKE %?1% ")
    public List<Categoria> findAll(String busqueda);
    
}
