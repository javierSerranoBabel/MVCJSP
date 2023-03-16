package com.babel.MVCJSP.services;

import com.babel.MVCJSP.models.Libro;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LibroService {
    List<Libro> listar();

    Optional<Libro> getLibro(String isbn);

    Libro aniadir(Libro libro);
}
