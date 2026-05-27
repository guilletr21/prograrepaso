package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumerosService {
    private PeliculaRepository peliculaRepo;

    public NumerosService(PeliculaRepository Repopelicula) {
        this.peliculaRepo = Repopelicula;
    }

    public ArrayList<Integer> todosLosNumeros() {
        ArrayList<Integer> numeros =new ArrayList<Integer>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        return numeros;
    }

    public List<Pelicula> AllPeliculas() {
        List<Pelicula> peliculas = peliculaRepo.findAll();

        return peliculas;
    }

    public Pelicula crearPelicula(Pelicula pelicula) {
        return peliculaRepo.save(pelicula);
    }
    
    public void borrarPelicula( Integer id) {
        peliculaRepo.deleteById(id);
    }

    public Pelicula obtenerPelicula(Integer id) {
       return peliculaRepo.findById(id).get();
    }

      public Pelicula actualizarPelicula(int i, Pelicula pelicula) {
        return peliculaRepo.save(pelicula);
    }
}
