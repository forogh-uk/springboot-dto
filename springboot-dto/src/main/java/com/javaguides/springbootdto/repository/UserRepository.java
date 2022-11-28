package com.javaguides.springbootdto.repository;

import com.javaguides.springbootdto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


//croud opration for respective entities interact with the database
public interface UserRepository extends JpaRepository<User,Long> {
}
