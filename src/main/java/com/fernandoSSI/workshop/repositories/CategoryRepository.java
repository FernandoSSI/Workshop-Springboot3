package com.fernandoSSI.workshop.repositories;

import com.fernandoSSI.workshop.entities.Category;
import com.fernandoSSI.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
