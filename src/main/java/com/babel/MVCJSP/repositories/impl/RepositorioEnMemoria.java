package com.babel.MVCJSP.repositories.impl;

import com.babel.MVCJSP.models.Libro;
import com.babel.MVCJSP.repositories.LibrosRepository;

import java.util.*;

//no hace falta repository porque estamos construyendo usando es el mapa estamos generando el bean en el config
public class RepositorioEnMemoria  implements LibrosRepository {
    private final Map<String,Libro> librosEnMemoria;

    public RepositorioEnMemoria(Map<String, Libro> librosEnMemoria) {
        this.librosEnMemoria = new HashMap<>();
        this.librosEnMemoria.putAll(librosEnMemoria);
    }

    @Override
    public Collection<Libro> listar() {
        if(librosEnMemoria.isEmpty()){
            return Collections.emptyList();
        }

        return librosEnMemoria.values();
    }

    @Override
    public Optional<Libro> getLibro(String isbn) {
        return Optional.ofNullable(librosEnMemoria.get(isbn));
    }

    @Override
    public Libro aniadir(Libro libro) {
        librosEnMemoria.put(libro.getIsbdn(),libro);
        return libro;
    }
}
