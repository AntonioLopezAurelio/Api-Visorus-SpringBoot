package com.apivisorus.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.apivisorus.model.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Integer>{

     @Query("SELECT pro FROM Producto pro WHERE pro.codigo LIKE %?1% OR pro.descripcion LIKE %?1% ")
    public List<Producto> findAll(String busqueda);
    
}
