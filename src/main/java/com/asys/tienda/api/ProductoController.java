package com.asys.tienda.api;

import com.asys.tienda.Persistencia.entidades.ProductoEntity;
import com.asys.tienda.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<ProductoEntity> listar() {
        return productoService.listar();
    }

    @PostMapping
    public ProductoEntity guardar(@RequestBody ProductoEntity producto) {
        return productoService.guardar(producto);
    }

    @PutMapping("/{id}")
    public ProductoEntity actualizar(@PathVariable Long id, @RequestBody ProductoEntity producto) {
        return productoService.actualizar(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminar(id);
    }
}
