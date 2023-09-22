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

import com.apivisorus.model.entity.CodigoBarras;
import com.apivisorus.service.ICodigoBarras;

@RestController
@RequestMapping("/api/v1")
public class CodigoBarrasController {

    @Autowired
    private ICodigoBarras codigoBarrasService;

    @PostMapping("codigobarras")
    @ResponseStatus(HttpStatus.CREATED)
    public CodigoBarras createCodigoBarras(@RequestBody CodigoBarras codigoBarras){
        return codigoBarrasService.save(codigoBarras);
    }

    @PutMapping("codigobarras")
    @ResponseStatus(HttpStatus.CREATED)
    public CodigoBarras updateCodigoBarras(@RequestBody CodigoBarras codigoBarras){
        return codigoBarrasService.save(codigoBarras);
    }

    @DeleteMapping("codigobarras/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCodigoBarras(@PathVariable Integer id){
        CodigoBarras codigoBarrasDelete = codigoBarrasService.findById(id);
        codigoBarrasService.delete(codigoBarrasDelete);
    }

    @GetMapping("codigobarras/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CodigoBarras showCodigoBarrasById(@PathVariable Integer id){
        return codigoBarrasService.findById(id);
    }

    @GetMapping("codigosbarras")
    @ResponseStatus(HttpStatus.OK)
    public List<CodigoBarras> showCodigosBarras(){
        return codigoBarrasService.findCodigosBarras();
    }
    
}
