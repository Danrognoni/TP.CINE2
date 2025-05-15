package com.cine.cine.Services;

import com.cine.cine.Models.Movie;
import com.cine.cine.Repository.movieRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movieService {
    @Autowired
    public movieRepository repo;

    public Movie createMovie (@Valid Movie movie){
         return repo.save(movie);
    }

    public List<Movie> listar (){
        return repo.findAll();
    }

    public void  eliminar (Long id){
         this.repo.deleteById(id);
    }
    public Optional<Movie> actualizar(Long id, Movie movie){
        return repo.findById(id).map(existing -> {
            existing.setTitulo(movie.getTitulo());
            existing.setGender(movie.getGender());
            return repo.save(existing);
        });
    }

}
