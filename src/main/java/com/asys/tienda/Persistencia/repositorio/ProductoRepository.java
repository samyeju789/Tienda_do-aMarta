package com.asys.tienda.Persistencia.repositorio;

import com.asys.tienda.Persistencia.entidades.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
}
