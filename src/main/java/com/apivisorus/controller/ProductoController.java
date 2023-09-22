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

import com.apivisorus.model.entity.Producto;
import com.apivisorus.service.IProducto;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {

    @Autowired
    private IProducto productoService;

    @PostMapping("producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto createProducto(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @PutMapping("producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto updateProducto(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @DeleteMapping("producto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProducto(@PathVariable Integer id){
        Producto productoDelete = productoService.findById(id);
        productoService.delete(productoDelete);
    }

    @GetMapping("producto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Producto showProductoById(@PathVariable Integer id){
        return productoService.findById(id);
    }

    @GetMapping("productos")
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> showProductos(){
        return productoService.findProductos();
    }
    
}
