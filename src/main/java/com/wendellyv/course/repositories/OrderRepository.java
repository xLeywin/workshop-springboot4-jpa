package com.wendellyv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendellyv.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
