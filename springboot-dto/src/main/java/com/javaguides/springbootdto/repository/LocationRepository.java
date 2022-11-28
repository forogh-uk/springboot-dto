package com.javaguides.springbootdto.repository;

import com.javaguides.springbootdto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
