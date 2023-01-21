package com.example.laPape.services;

import com.example.laPape.model.Client;
import com.example.laPape.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public void addClient(Client client){
        clientRepository.save(client);
    }
}
