package com.apivisorus.service;

import java.util.List;

import com.apivisorus.model.entity.CodigoBarras;

public interface ICodigoBarras {

    CodigoBarras save(CodigoBarras codigoBarras);

    CodigoBarras findById(Integer id);

    void delete(CodigoBarras codigoBarras);

    List<CodigoBarras> findCodigosBarras();
    
}
