package com.apivisorus.service.impl;

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
    
}
