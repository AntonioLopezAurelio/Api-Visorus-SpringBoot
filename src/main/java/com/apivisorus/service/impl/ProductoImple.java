package com.apivisorus.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apivisorus.model.dao.CategoriaDao;
import com.apivisorus.model.dao.ProductoDao;
import com.apivisorus.model.entity.Categoria;
import com.apivisorus.model.entity.Producto;
import com.apivisorus.service.IProducto;

@Service
public class ProductoImple implements IProducto{

    @Autowired
    private ProductoDao productoDao;

    @Autowired
    private CategoriaDao categoriaDao;

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
        Optional<Categoria> categoriaOptional = categoriaDao.findById(producto.getCategoria().getIdCategoria());

        if(categoriaOptional.isPresent()){
            producto.setCategoria(categoriaOptional.get());
        }
        return productoDao.save(producto);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Producto> findProductos() {
        
        Iterable<Producto> iterable = productoDao.findAll();

        List<Producto> productos = StreamSupport.stream(iterable.spliterator(), false).map(producto ->{
            Producto prod = new Producto();
            BeanUtils.copyProperties(producto, prod);
            return prod;
        }).collect(Collectors.toList());

        return productos; 
    }
    
}
