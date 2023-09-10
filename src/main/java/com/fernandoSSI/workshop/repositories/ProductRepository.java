package com.fernandoSSI.workshop.repositories;

import com.fernandoSSI.workshop.entities.Category;
import com.fernandoSSI.workshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
