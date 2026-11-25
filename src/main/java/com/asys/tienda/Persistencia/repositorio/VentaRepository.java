package com.asys.tienda.Persistencia.repositorio;

import com.asys.tienda.Persistencia.entidades.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<VentaEntity, Long> {
}
