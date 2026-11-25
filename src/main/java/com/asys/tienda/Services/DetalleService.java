package com.asys.tienda.Services;

import com.asys.tienda.Persistencia.entidades.DetalleEntity;
import com.asys.tienda.Persistencia.repositorio.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    public List<DetalleEntity> listar() {
        return detalleRepository.findAll();
    }

    public DetalleEntity guardar(DetalleEntity detalle) {
        return detalleRepository.save(detalle);
    }

    public DetalleEntity actualizar(Long id, DetalleEntity datos) {
        Optional<DetalleEntity> existente = detalleRepository.findById(id);
        if (existente.isPresent()) {
            DetalleEntity detalle = existente.get();
            detalle.setCantidad(datos.getCantidad());
            detalle.setSubtotal(datos.getSubtotal());
            detalle.setVenta(datos.getVenta());
            detalle.setProducto(datos.getProducto());
            return detalleRepository.save(detalle);
        }
        return null;
    }

    public void eliminar(Long id) {
        detalleRepository.deleteById(id);
    }
}
