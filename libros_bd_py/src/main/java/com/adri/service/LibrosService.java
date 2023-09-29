package com.adri.service;

import java.util.List;

import com.adri.model.Libro;

public interface LibrosService {
     List<Libro> lista();
     Libro buscar(int isbn);
     void agregar(Libro libro);
     void editar(Libro libro);
     void eliminar(int isbn);
}
