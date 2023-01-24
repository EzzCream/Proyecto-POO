package com.example.laPape.controller;

import com.example.laPape.model.Client;
import com.example.laPape.model.Order;
import com.example.laPape.services.ClientService;
import com.example.laPape.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ClientService clientService;

    @PostMapping("create/{id}")
    public ResponseEntity<String> createOrder(@RequestBody Order order, @PathVariable String id){
        String ord = orderService.createOrder(order);
        return ResponseEntity.ok("Order genereted");
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable String id){
        orderService.cancelOrder(id);
        return ResponseEntity.ok("Order deleted");
    }
}
