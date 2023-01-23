package com.example.laPape.repository;

import com.example.laPape.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart,String> {

}
