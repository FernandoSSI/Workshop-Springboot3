package com.fernandoSSI.workshop.services;

import com.fernandoSSI.workshop.entities.Order;
import com.fernandoSSI.workshop.entities.Product;
import com.fernandoSSI.workshop.repositories.OrderRepository;
import com.fernandoSSI.workshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
