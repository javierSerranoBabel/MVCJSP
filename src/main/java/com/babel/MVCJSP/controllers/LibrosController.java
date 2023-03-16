package com.babel.MVCJSP.controllers;

import com.babel.MVCJSP.models.Libro;
import com.babel.MVCJSP.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/libros")
public class LibrosController {

    private final LibroService libroService;

    public LibrosController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping("")
    public String listaLibros(Model model){
        ArrayList<Libro> libros = new ArrayList<Libro>(libroService.listar());
        model.addAttribute("libros",libros);
        return "libros";
        //request.setAttribute("libros",libroService.listar());

    }
    /*@RequestMapping("/libros")
    public ModelAndView libros(@RequestParam("isbn") int id){
        ModelAndView mav = new ModelAndView("libro");
        mav.addObject(libroService.getLibro())
    }*/
}
