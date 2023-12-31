package com.apivisorus.model.entity;

import java.io.Serializable;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{

    @Id
    @Column(name = "id_categoria")
    @ GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    @Column(name = "codigo", nullable = false, length=10)
    private String codigo;

    @Column(name = "descripcion", nullable = false, length=40)
    private String descripcion;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria") //, cascade = CascadeType.ALL)
    List<Producto> productos;

     
}
