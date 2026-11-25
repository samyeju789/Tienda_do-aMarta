package com.asys.tienda.api;

import com.asys.tienda.Persistencia.entidades.CategoriaEntity;
import com.asys.tienda.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaEntity> listar() {
        return categoriaService.listar();
    }

    @PostMapping
    public CategoriaEntity guardar(@RequestBody CategoriaEntity categoria) {
        return categoriaService.guardar(categoria);
    }

    @PutMapping("/{id}")
    public CategoriaEntity actualizar(@PathVariable Long id, @RequestBody CategoriaEntity categoria) {
        return categoriaService.actualizar(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        categoriaService.eliminar(id);
    }
}
