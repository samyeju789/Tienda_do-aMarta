package com.asys.tienda.Persistencia.repositorio;

import com.asys.tienda.Persistencia.entidades.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
