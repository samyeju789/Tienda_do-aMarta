package com.asys.tienda.Persistencia.repositorio;

import com.asys.tienda.Persistencia.entidades.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
}
