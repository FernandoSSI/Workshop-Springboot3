package com.fernandoSSI.workshop.repositories;

import com.fernandoSSI.workshop.entities.Order;
import com.fernandoSSI.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
