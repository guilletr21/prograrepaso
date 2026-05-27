package com.example.demo;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;






@Controller
public class HomeController {
    

private NumerosService nums;
public HomeController(NumerosService numeros) {
    this.nums = numeros;
   
}


   /*  @GetMapping("/") 
    public String index(Model modelo) {
        ArrayList<Integer> numeros = nums.todosLosNumeros();
        modelo.addAttribute("dato", "hola");
        modelo.addAttribute("numeros", numeros);
        
        return "dashboard";
    }
     */
    @GetMapping("/") 
    public String pelis(Model modelo) {
        List<Pelicula> peliculas =nums.AllPeliculas();
        modelo.addAttribute("dato", "peliculas para ver");
        modelo.addAttribute("pelis", peliculas);
        
        return "dashboard";
    }
    
    @GetMapping("/crear") 
    public String crearPelicula(@ModelAttribute("pelicula") Pelicula pelicula) {
       nums.crearPelicula(pelicula);
        return "redirect:/";
    }

    @PostMapping("/borrar")
    public String borrarPelicula(@ModelAttribute("id") Integer id) {
        nums.borrarPelicula(id);
        return "redirect:/";
    }
    
    @PostMapping("/editar")
    public String editarPelicula(Model modelo,@ModelAttribute("id") Integer id) {
        Pelicula pelicula = nums.obtenerPelicula(id);
        modelo.addAttribute("pelicula", pelicula);
        return "redirect:/";
    }

    @PostMapping("/actualizar")
    public String actualizarPelicula(@ModelAttribute("pelicula") Pelicula pelicula) {
        nums.actualizarPelicula(pelicula.getId(), pelicula);
        return "redirect:/";
    }
    
}
