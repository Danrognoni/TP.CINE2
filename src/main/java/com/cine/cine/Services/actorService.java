package com.cine.cine.Services;

import com.cine.cine.Models.Actor;
import com.cine.cine.Models.Review;
import com.cine.cine.Repository.actorRepository;
import com.cine.cine.Repository.reviewRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class actorService {
    @Autowired
    public actorRepository repo;

    public Actor createMovie (@Valid Actor actor){
        return repo.save(actor);
    }

    public List<Actor> listar (){
        return repo.findAll();
    }

    public void  eliminar (Long id){
        this.repo.deleteById(id);
    }
    public Optional<Actor> actualizar(Long id, Actor actor){
        return repo.findById(id).map(existing -> {
            existing.setNombre(actor.getNombre());
            existing.setNacionalidad(actor.getNacionalidad());
            return repo.save(existing);
        });
    }
}
