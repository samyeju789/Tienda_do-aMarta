package com.asys.tienda.Persistencia.entidades;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalle")
@Getter
@Setter
@NoArgsConstructor
public class DetalleEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private long id;

    private int cantidad;
    private long subtotal;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private VentaEntity venta;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity producto;
}
