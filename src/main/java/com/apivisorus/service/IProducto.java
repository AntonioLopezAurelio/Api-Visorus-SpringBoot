package com.apivisorus.service;

import com.apivisorus.model.entity.Producto;

public interface IProducto {
    Producto save(Producto producto);

    Producto findById(Integer id);

    void delete(Producto producto);
}
