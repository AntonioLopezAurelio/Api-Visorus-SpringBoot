package com.apivisorus.model.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.type.descriptor.java.BooleanJavaType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "activo")
    private Boolean activo;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    List<Producto> productos;

    
}
