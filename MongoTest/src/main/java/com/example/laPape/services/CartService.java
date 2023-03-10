package com.example.laPape.services;

import com.example.laPape.model.Cart;
import com.example.laPape.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;

    public String createCart(Cart cart){
        Cart val = cartRepository.save(cart);
        return val.getId();
    }
    public Optional<Cart> getCartById(String id){
        return cartRepository.findById(id);
    }
}
