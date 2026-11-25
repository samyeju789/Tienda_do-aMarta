package com.asys.tienda.Persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "abono")
@Getter
@Setter
@NoArgsConstructor
public class AbonoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_abono")
    private long id;

    private LocalDateTime fecha;
    private double valor;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;
}
