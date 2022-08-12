package com.app.udemydemospring.resources;

import com.app.udemydemospring.entities.Order;
import com.app.udemydemospring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService OrderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){

        List<Order> result = OrderService.findAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){

        Order Order = OrderService.findById(id);
        return ResponseEntity.ok().body(Order);
    }
}