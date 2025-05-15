package com.cine.cine.Repository;

import com.cine.cine.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<Movie,Long> {

    void existsByDirector(String nombreDirector);

}
