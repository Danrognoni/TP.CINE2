package Services;

import Models.Movie;
import Repository.movieRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class movieService {
    public movieRepository movieRepository;
    @Autowired
    public movieService(movieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie (@Valid Movie movie){

    }
}
