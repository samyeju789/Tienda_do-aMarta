package com.asys.tienda.api;

import com.asys.tienda.Persistencia.entidades.AbonoEntity;
import com.asys.tienda.Services.AbonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abonos")
public class AbonoController {

    @Autowired
    private AbonoService abonoService;

    @GetMapping
    public List<AbonoEntity> listar() {
        return abonoService.listar();
    }

    @PostMapping
    public AbonoEntity guardar(@RequestBody AbonoEntity abono) {
        return abonoService.guardar(abono);
    }

    @PutMapping("/{id}")
    public AbonoEntity actualizar(@PathVariable Long id, @RequestBody AbonoEntity abono) {
        return abonoService.actualizar(id, abono);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        abonoService.eliminar(id);
    }
}
