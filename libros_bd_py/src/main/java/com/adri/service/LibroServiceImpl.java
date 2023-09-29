package com.adri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.dao.LibrosDAO;
import com.adri.model.Libro;

@Service
public class LibroServiceImpl implements LibrosService{

    @Autowired
    LibrosDAO dao;
    /**
     * Usamos el repositorio de JPA para hacer la funcionalidades de busqueda, eliminar, editar y agregar.
     */

    @Override
    public List<Libro> lista() {
        return dao.findAll();
    }

    @Override
    public Libro buscar(int isbn) {
        
      return dao.findById(isbn).orElse(null);
       
    }

    @Override
    public void agregar(Libro libro) {
        
        dao.save(libro);
    }

    @Override
    public void editar(Libro libro) {
       dao.save(libro);
    }

    @Override
    public void eliminar(int isbn) {
        dao.deleteById(isbn);
    }
    
}
