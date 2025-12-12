package com.wendellyv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wendellyv.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
