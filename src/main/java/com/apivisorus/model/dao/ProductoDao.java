package com.apivisorus.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.apivisorus.model.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Integer>{
    
}
