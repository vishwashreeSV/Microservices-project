package com.microservices.order.orderservice.repository;

import com.microservices.order.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.ListCrudRepository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
