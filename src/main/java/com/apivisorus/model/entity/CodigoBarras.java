package com.apivisorus.model.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "codigo_barra")

public class CodigoBarras  implements Serializable{
    @Id
    @Column(name = "id_codigobarra")
    @ GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCodigoBarras;

    @Column(name = "codigo", nullable = false, length=20)
    private String codigo;

    @Column(name = "activo",  nullable = false)
    private Boolean activo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    @JsonProperty(access = Access.WRITE_ONLY)
    private Producto producto;
}
