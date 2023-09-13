package com.fernandoSSI.workshop.repositories;

import com.fernandoSSI.workshop.entities.Category;
import com.fernandoSSI.workshop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
