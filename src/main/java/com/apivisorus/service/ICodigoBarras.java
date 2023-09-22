package com.apivisorus.service;

import com.apivisorus.model.entity.CodigoBarras;

public interface ICodigoBarras {

    CodigoBarras save(CodigoBarras codigoBarras);

    CodigoBarras findById(Integer id);

    void delete(CodigoBarras codigoBarras);
    
}
