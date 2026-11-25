package com.asys.tienda.Services;


import com.asys.tienda.Persistencia.entidades.VentaEntity;
import com.asys.tienda.Persistencia.repositorio.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<VentaEntity> listar() {
        return ventaRepository.findAll();
    }

    public VentaEntity guardar(VentaEntity venta) {
        if (venta.getFecha() == null) {
            venta.setFecha(LocalDateTime.now());
        }
        return ventaRepository.save(venta);
    }

    public VentaEntity actualizar(Long id, VentaEntity datos) {
        Optional<VentaEntity> existente = ventaRepository.findById(id);
        if (existente.isPresent()) {
            VentaEntity venta = existente.get();
            venta.setFecha(datos.getFecha());
            venta.setTotal(datos.getTotal());
            venta.setCliente(datos.getCliente());
            return ventaRepository.save(venta);
        }
        return null;
    }

    public void eliminar(Long id) {
        ventaRepository.deleteById(id);
    }
}
