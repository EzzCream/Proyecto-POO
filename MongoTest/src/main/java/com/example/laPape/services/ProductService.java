package com.example.laPape.services;

import com.example.laPape.model.Products;
import com.example.laPape.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void addProduct(Products product){
        productRepository.save(product);
    }
    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }
    public Optional<Products> getProdById(String id){
        return productRepository.findById(id);
    }
    public void deleteById(String id){
        productRepository.deleteById(id);
    }
}
