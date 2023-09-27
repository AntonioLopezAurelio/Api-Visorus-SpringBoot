package com.apivisorus.service;

import java.util.List;

import com.apivisorus.model.entity.Producto;

public interface IProducto {
    Producto save(Producto producto);

    Producto findById(Integer id);

    void delete(Producto producto);

    List<Producto> findProductos();

    List<Producto> findProductoPalabraClave(String busqueda);
}
