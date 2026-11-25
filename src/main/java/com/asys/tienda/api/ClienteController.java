package com.asys.tienda.api;


import com.asys.tienda.Persistencia.entidades.ClienteEntity;
import com.asys.tienda.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteEntity> listar() {
        return clienteService.listar();
    }

    @PostMapping
    public ClienteEntity guardar(@RequestBody ClienteEntity cliente) {
        return clienteService.guardar(cliente);
    }

    @PutMapping("/{id}")
    public ClienteEntity actualizar(@PathVariable Long id, @RequestBody ClienteEntity cliente) {
        return clienteService.actualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        clienteService.eliminar(id);
    }
}
