package com.example.laPape.controller;

import com.example.laPape.model.Cart;
import com.example.laPape.services.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    @GetMapping("/getCart/{id}")
    public ResponseEntity<Optional<Cart>> getCartById(@PathVariable String id){
        return ResponseEntity.ok(cartService.getCartById(id));
    }
}
