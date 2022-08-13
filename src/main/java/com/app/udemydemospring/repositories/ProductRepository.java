package com.app.udemydemospring.repositories;

import com.app.udemydemospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
