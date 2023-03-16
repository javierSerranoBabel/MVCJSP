package com.babel.MVCJSP;

import com.babel.MVCJSP.models.Libro;
import com.babel.MVCJSP.repositories.LibrosRepository;
import com.babel.MVCJSP.repositories.impl.RepositorioEnMemoria;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class LibrosConfig {
    @Bean
    public LibrosRepository proveedorLibros(){ return new RepositorioEnMemoria(initDatos());}

    private static Map<String, Libro> initDatos(){
        Map<String, Libro> initDatos = new HashMap<>();
        initDatos.put("ISBN-1", new Libro("ISBN-1","titulo1","autor1"));
        initDatos.put("ISBN-2", new Libro("ISBN-2","titulo2","autor2"));
        initDatos.put("ISBN-3", new Libro("ISBN-3","titulo3","autor3"));
        initDatos.put("ISBN-4", new Libro("ISBN-4","titulo4","autor4"));
        initDatos.put("ISBN-5", new Libro("ISBN-5","titulo5","autor5"));
        return initDatos;
    }
}
