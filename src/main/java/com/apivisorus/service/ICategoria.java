package com.apivisorus.service;

import com.apivisorus.model.entity.Categoria;

public interface ICategoria {

    Categoria save(Categoria categoria);

    Categoria findById(Integer id);

    void delete(Categoria categoria);
    
}
