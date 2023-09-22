package com.apivisorus.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.apivisorus.model.entity.Categoria;

public interface CategoriaDao extends CrudRepository<Categoria, Integer>{
    
}
