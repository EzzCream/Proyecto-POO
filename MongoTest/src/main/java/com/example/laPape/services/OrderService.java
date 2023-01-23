package com.example.laPape.services;

import com.example.laPape.model.Order;
import com.example.laPape.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public String createOrder (Order order){
        Order ord = orderRepository.save(order);
        return ord.getId();
    }
    public void cancelOrder(String id){
        orderRepository.deleteById(id);
    }
}
