package com.wendellyv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendellyv.course.entities.OrderItem;
import com.wendellyv.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
