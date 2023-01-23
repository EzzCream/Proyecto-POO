package com.example.laPape.controller;

import com.example.laPape.model.Cart;
import com.example.laPape.model.Client;
import com.example.laPape.services.CartService;
import com.example.laPape.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    private final CartService cartService;

    @PostMapping("/addClient")
    public ResponseEntity<String> addClient(@RequestBody Client client){
        client.setIdCart(cartService.createCart(new Cart()));
        clientService.addClient(client);
        return ResponseEntity.ok("Client created");
    }
    @PostMapping("/validate")
    public ResponseEntity<Optional<Client>> validateClient(@RequestBody Client client){
        Optional<Client> val = clientService.getClient(client.getId());
        if(val.isPresent()){
            if(Objects.equals(val.get().getPassword(), client.getPassword())){
                return ResponseEntity.ok(val);
            }else{
                return ResponseEntity.noContent().build();
            }
        }else{
            return ResponseEntity.noContent().build();
        }
    }
}
