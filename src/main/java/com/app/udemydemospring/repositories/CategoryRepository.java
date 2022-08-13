package com.app.udemydemospring.repositories;

import com.app.udemydemospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
