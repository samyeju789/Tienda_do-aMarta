package com.asys.tienda.Services;

import com.asys.tienda.Persistencia.entidades.ProductoEntity;
import com.asys.tienda.Persistencia.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<ProductoEntity> listar() {
        return productoRepository.findAll();
    }

    public ProductoEntity guardar(ProductoEntity producto) {
        return productoRepository.save(producto);
    }

    public ProductoEntity actualizar(Long id, ProductoEntity datos) {
        Optional<ProductoEntity> existente = productoRepository.findById(id);
        if (existente.isPresent()) {
            ProductoEntity producto = existente.get();
            producto.setNombre(datos.getNombre());
            producto.setStock(datos.getStock());
            producto.setCategoria(datos.getCategoria());
            return productoRepository.save(producto);
        }
        return null;
    }

    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}