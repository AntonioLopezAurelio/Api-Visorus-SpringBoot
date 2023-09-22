package com.apivisorus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apivisorus.model.dao.ProductoDao;
import com.apivisorus.model.entity.Producto;
import com.apivisorus.service.IProducto;

@Service
public class ProductoImple implements IProducto{

    @Autowired
    private ProductoDao productoDao;

    @Transactional
    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
        
    }

    @Transactional(readOnly = true)
    @Override
    public Producto findById(Integer id) {
        return productoDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }
    
}
