package com.adri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adri.model.Libro;
import com.adri.service.LibrosService;

@RestController
public class LibroController {

    @Autowired
    LibrosService service;
/**
 * @GetMapping Utilizamos el verbo Get
 * @return la lista de todos los libros
 */
    @GetMapping(value = "/libros", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> lista(){
        return service.lista();
    }

    /**
     * @GetMapping Lo utilizamos para obetenr el libro
     * @param isbn lo que usamos para buscar el libro
     * @return el libro correspondiente
     */
    @GetMapping(value = "/libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro buscar(@PathVariable int isbn){

        return service.buscar(isbn);
    }

    /**
     * @PostMaping Usamos el verbo post para indicar que agregamos
     * @RequestBody Recoge la variable libro que consume en formato JSON
     * @param libro
     */
    @PostMapping(value = "/libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregar(@RequestBody Libro libro){
        service.agregar(libro);
    }

    /**
     * @PutMapping Usamos este verbo para indicar que queremos actualizar
     * @param libro
     */
    @PutMapping(value = "/libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void editar(@RequestBody Libro libro){
        service.editar(libro);
    }

    /**
     * @DeleteMaping Usamos este verbo para indicar que queremos eliminar
     * @param isbn
     */
    @DeleteMapping(value = "/libro/{isbn}")
    public void eliminar(@PathVariable int isbn){
        service.eliminar(isbn);
    }
    
}
