package com.asys.tienda.Services;

import com.asys.tienda.Persistencia.entidades.ClienteEntity;
import com.asys.tienda.Persistencia.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteEntity> listar() {
        return clienteRepository.findAll();
    }

    public ClienteEntity guardar(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteEntity actualizar(Long id, ClienteEntity datos) {
        Optional<ClienteEntity> existente = clienteRepository.findById(id);
        if (existente.isPresent()) {
            ClienteEntity cliente = existente.get();
            cliente.setNombre(datos.getNombre());
            return clienteRepository.save(cliente);
        }
        return null;
    }

    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}
