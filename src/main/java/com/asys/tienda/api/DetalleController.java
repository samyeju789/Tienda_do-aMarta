package com.asys.tienda.api;

import com.asys.tienda.Persistencia.entidades.DetalleEntity;
import com.asys.tienda.Services.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalles")
public class DetalleController {

    @Autowired
    private DetalleService detalleService;

    @GetMapping
    public List<DetalleEntity> listar() {
        return detalleService.listar();
    }

    @PostMapping
    public DetalleEntity guardar(@RequestBody DetalleEntity detalle) {
        return detalleService.guardar(detalle);
    }

    @PutMapping("/{id}")
    public DetalleEntity actualizar(@PathVariable Long id, @RequestBody DetalleEntity detalle) {
        return detalleService.actualizar(id, detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        detalleService.eliminar(id);
    }
}
