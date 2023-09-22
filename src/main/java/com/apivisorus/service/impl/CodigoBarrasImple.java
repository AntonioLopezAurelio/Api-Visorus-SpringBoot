package com.apivisorus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apivisorus.model.dao.CodigoBarrasDao;
import com.apivisorus.model.entity.CodigoBarras;
import com.apivisorus.service.ICodigoBarras;

@Service
public class CodigoBarrasImple implements ICodigoBarras{

     @Autowired
    private CodigoBarrasDao codigoBarrasDao;

    @Transactional
    @Override
    public void delete(CodigoBarras codigoBarras) {
        codigoBarrasDao.delete(codigoBarras);
        
    }

    @Transactional(readOnly = true)
    @Override
    public CodigoBarras findById(Integer id) {
        return codigoBarrasDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public CodigoBarras save(CodigoBarras codigoBarras) {
        return codigoBarrasDao.save(codigoBarras);
    }
    
}
