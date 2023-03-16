package com.babel.MVCJSP.repositories;

import com.babel.MVCJSP.models.Libro;

import java.util.Collection;
import java.util.Optional;

public interface LibrosRepository {
    Collection<Libro> listar();

    Optional<Libro> getLibro(String isbn);

    Libro aniadir(Libro libro);
}
