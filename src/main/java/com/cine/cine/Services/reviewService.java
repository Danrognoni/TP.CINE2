package com.cine.cine.Services;

import com.cine.cine.Models.Movie;
import com.cine.cine.Models.Review;
import com.cine.cine.Repository.movieRepository;
import com.cine.cine.Repository.reviewRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.util.List;
import java.util.Optional;
@Service
public class reviewService {

    @Autowired
    public reviewRepository repo;

    public Review createMovie (@Valid Review review){
        return repo.save(review);
    }

    public List<Review> listar (){
        return repo.findAll();
    }

    public void  eliminar (Long id){
        this.repo.deleteById(id);
    }
    public Optional<Review> actualizar(Long id, Review review){
        return repo.findById(id).map(existing -> {
            existing.setComentario(review.getComentario());
            existing.setPuntuacion(review.getPuntuacion());
            return repo.save(existing);
        });
    }
}
