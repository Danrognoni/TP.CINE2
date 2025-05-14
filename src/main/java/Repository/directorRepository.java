package Repository;

import Models.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface directorRepository extends JpaRepository<Director,Long> {
}
