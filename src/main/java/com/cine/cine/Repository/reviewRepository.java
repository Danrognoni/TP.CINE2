package com.cine.cine.Repository;

import com.cine.cine.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reviewRepository extends JpaRepository<Review,Long> {
}
