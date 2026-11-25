package com.asys.tienda.Persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "venta")
@Getter
@Setter
@NoArgsConstructor
public class VentaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private long id;

    private LocalDateTime fecha;
    private long total;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;

}
