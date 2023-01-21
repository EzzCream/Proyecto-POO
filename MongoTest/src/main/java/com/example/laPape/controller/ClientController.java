package com.example.laPape.controller;

import com.example.laPape.model.Client;
import com.example.laPape.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/addClient")
    public ResponseEntity<String> addClient(@RequestBody Client client){
        clientService.addClient(client);
        return ResponseEntity.ok("Client created");
    }
}
