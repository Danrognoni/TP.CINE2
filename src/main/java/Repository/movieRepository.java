package Repository;

import Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<Movie,Long> {

    void existsByDirector(String nombreDirector);
}
