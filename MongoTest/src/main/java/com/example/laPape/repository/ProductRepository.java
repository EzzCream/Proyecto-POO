package com.example.laPape.repository;

import com.example.laPape.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products, String> {
}
