package com.cine.cine.Services;

import com.cine.cine.Models.Gender;
import com.cine.cine.Models.Review;
import com.cine.cine.Repository.genderRepository;
import com.cine.cine.Repository.reviewRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class genderService {
    @Autowired
    public genderRepository repo;

    public Gender createMovie (@Valid Gender gender){
        return repo.save(gender);
    }

    public List<Gender> listar (){
        return repo.findAll();
    }

    public void  eliminar (Long id){
        this.repo.deleteById(id);
    }
    public Optional<Gender> actualizar(Long id, Gender gender){
        return repo.findById(id).map(existing -> {
            existing.setNombre(gender.getNombre());
            return repo.save(existing);
        });
    }

}
