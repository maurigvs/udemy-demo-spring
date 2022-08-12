package com.app.udemydemospring.services;

import com.app.udemydemospring.entities.Order;
import com.app.udemydemospring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll(){
        return OrderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> Order = OrderRepository.findById(id);
        return Order.get();
    }
}
