package com.example.laPape.controller;

import com.example.laPape.model.Products;
import com.example.laPape.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody Products products){
        productService.addProduct(products);
        return ResponseEntity.ok("Producto agregado");
    }

    @GetMapping("/getAll")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/getById/{id}")
    public Products getById(@PathVariable String id){
        return productService.getProdById(id).get();
    }
    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<String> deleteProd(@PathVariable String id){
        productService.deleteById(id);
        return ResponseEntity.ok("Product deleted");
    }
}
