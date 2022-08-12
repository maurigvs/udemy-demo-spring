package com.app.udemydemospring.repositories;

import com.app.udemydemospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
