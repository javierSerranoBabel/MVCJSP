package com.babel.MVCJSP.services.impl;

import com.babel.MVCJSP.models.Libro;
import com.babel.MVCJSP.repositories.LibrosRepository;
import com.babel.MVCJSP.services.LibroService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class LibroServiceImpl implements LibroService {
    LibrosRepository librosRepository;

    public LibroServiceImpl(LibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }

    @Override
    public List<Libro> listar() {
        //return (List)librosRepository.listar();//.stream().collect(Collectors.toList());
        return librosRepository.listar().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Libro> getLibro(String isbn) {
        return librosRepository.getLibro(isbn);
    }

    @Override
    public Libro aniadir(Libro libro) {
        return librosRepository.aniadir(libro);
    }
}
