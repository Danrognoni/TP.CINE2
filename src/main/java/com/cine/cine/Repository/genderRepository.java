package com.cine.cine.Repository;

import com.cine.cine.Models.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface genderRepository extends JpaRepository<Gender,Long> {
}
