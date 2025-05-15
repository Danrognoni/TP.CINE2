package com.cine.cine.Repository;

import com.cine.cine.Models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface actorRepository extends JpaRepository<Actor,Long> {
}
