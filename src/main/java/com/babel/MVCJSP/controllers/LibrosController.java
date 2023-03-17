package com.babel.MVCJSP.controllers;

import com.babel.MVCJSP.models.Libro;
import com.babel.MVCJSP.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
@RequestMapping("/libros")
public class LibrosController {

    private final LibroService libroService;

    public LibrosController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping("/list")
    public String listaLibros(Model model){
        ArrayList<Libro> libros = new ArrayList<Libro>(libroService.listar()); // Se puede quitar
        model.addAttribute("libros",libros);
        return "libros";
        //request.setAttribute("libros",libroService.listar());

    }

    @GetMapping("")
    public String addBookVies(Model model){
        return "add-libro";
    }

    @PostMapping("") // como es posrt lo reconoce y no hace falta poner nada
    public RedirectView  addLibro(@ModelAttribute("libro") Libro libro, RedirectAttributes redirectAttributes){
        final RedirectView redirectView = new RedirectView("/libros/",true);
        Libro savedBook = libroService.aniadir(libro);
        redirectAttributes.addFlashAttribute("savedBook",savedBook);
        redirectAttributes.addFlashAttribute("success",true);
        return redirectView;
    }





    /*@RequestMapping("/libros")
    public ModelAndView libros(@RequestParam("isbn") int id){
        ModelAndView mav = new ModelAndView("libro");
        mav.addObject(libroService.getLibro())
    }*/
}
