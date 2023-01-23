package com.example.laPape.controller;

import com.example.laPape.model.Cart;
import com.example.laPape.services.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @PostMapping("/update")
    public ResponseEntity<String> updateCart(@RequestBody Cart cart){
        cartService.createCart(cart);
        return ResponseEntity.ok("Cart updated");
    }
}
