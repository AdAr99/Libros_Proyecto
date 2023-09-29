package com.adri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adri.model.Libro;

public interface LibrosDAO extends JpaRepository<Libro, Integer>  {
}
