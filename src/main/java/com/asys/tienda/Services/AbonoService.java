package com.asys.tienda.Services;


import com.asys.tienda.Persistencia.entidades.AbonoEntity;
import com.asys.tienda.Persistencia.repositorio.AbonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AbonoService {

    @Autowired
    private AbonoRepository abonoRepository;

    public List<AbonoEntity> listar() {
        return abonoRepository.findAll();
    }

    public AbonoEntity guardar(AbonoEntity abono) {
        if (abono.getFecha() == null) {
            abono.setFecha(LocalDateTime.now());
        }
        return abonoRepository.save(abono);
    }

    public AbonoEntity actualizar(Long id, AbonoEntity datos) {
        Optional<AbonoEntity> existente = abonoRepository.findById(id);
        if (existente.isPresent()) {
            AbonoEntity abono = existente.get();
            abono.setFecha(datos.getFecha());
            abono.setValor(datos.getValor());
            abono.setCliente(datos.getCliente());
            return abonoRepository.save(abono);
        }
        return null;
    }

    public void eliminar(Long id) {
        abonoRepository.deleteById(id);
    }
}
