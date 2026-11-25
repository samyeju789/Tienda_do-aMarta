package com.asys.tienda.Persistencia.repositorio;

import com.asys.tienda.Persistencia.entidades.AbonoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonoRepository extends JpaRepository<AbonoEntity, Long> {
}
