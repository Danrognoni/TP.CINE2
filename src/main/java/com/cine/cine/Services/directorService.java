package com.cine.cine.Services;

import com.cine.cine.Models.Director;
import com.cine.cine.Models.Review;
import com.cine.cine.Repository.directorRepository;
import com.cine.cine.Repository.reviewRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class directorService {
    @Autowired
    public directorRepository repo;

    public Director createMovie (@Valid Director director){
        return repo.save(director);
    }

    public List<Director> listar (){
        return repo.findAll();
    }

    public void  eliminar (Long id){
        this.repo.deleteById(id);
    }
    public Optional<Director> actualizar(Long id, Director director){
        return repo.findById(id).map(existing -> {
            existing.setNombre(director.getNombre());
            return repo.save(existing);
        });
    }
}
