package com.asys.tienda.api;

import com.asys.tienda.Persistencia.entidades.VentaEntity;
import com.asys.tienda.Services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<VentaEntity> listar() {
        return ventaService.listar();
    }

    @PostMapping
    public VentaEntity guardar(@RequestBody VentaEntity venta) {
        return ventaService.guardar(venta);
    }

    @PutMapping("/{id}")
    public VentaEntity actualizar(@PathVariable Long id, @RequestBody VentaEntity venta) {
        return ventaService.actualizar(id, venta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ventaService.eliminar(id);
    }
}
