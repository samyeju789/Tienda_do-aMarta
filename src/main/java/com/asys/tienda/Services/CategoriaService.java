package com.asys.tienda.Services;


import com.asys.tienda.Persistencia.entidades.CategoriaEntity;
import com.asys.tienda.Persistencia.repositorio.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaEntity> listar() {
        return categoriaRepository.findAll();
    }

    public CategoriaEntity guardar(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    public CategoriaEntity actualizar(Long id, CategoriaEntity datos) {
        Optional<CategoriaEntity> existente = categoriaRepository.findById(id);
        if (existente.isPresent()) {
            CategoriaEntity categoria = existente.get();
            categoria.setNombre(datos.getNombre());
            categoria.setNombre(datos.getNombre());
            return categoriaRepository.save(categoria);
        }
        return null;
    }

    public void eliminar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
