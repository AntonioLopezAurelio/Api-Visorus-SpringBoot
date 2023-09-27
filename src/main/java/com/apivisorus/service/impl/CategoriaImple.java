package com.apivisorus.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apivisorus.model.dao.CategoriaDao;
import com.apivisorus.model.entity.Categoria;
import com.apivisorus.service.ICategoria;

@Service
public class CategoriaImple implements ICategoria {

    @Autowired
    private CategoriaDao categoriaDao;

    @Transactional
    @Override
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
        
    }

    @Transactional(readOnly = true)
    @Override
    public Categoria findById(Integer id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Categoria> findCategorias() {
        
        Iterable<Categoria> iterable = categoriaDao.findAll();

        List<Categoria> categorias = StreamSupport.stream(iterable.spliterator(), false).map(categoria ->{
            Categoria catg = new Categoria();
            BeanUtils.copyProperties(categoria, catg);
            return catg;
        }).collect(Collectors.toList());

        return categorias; 
    }

    @Transactional(readOnly = true)
    @Override
    public List<Categoria> findCategoriasCodigo() {
        
        Iterable<Categoria> iterable = categoriaDao.findAll();

        List<Categoria> categorias = StreamSupport.stream(iterable.spliterator(), false).map(categoria ->{
            Categoria catg = new Categoria();
            BeanUtils.copyProperties(categoria, catg);
            return catg;
        }).collect(Collectors.toList());

        return categorias; 
    }
    
}
