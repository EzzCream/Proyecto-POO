package com.example.laPape.services;

import com.example.laPape.model.Client;
import com.example.laPape.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public void addClient(Client client){
        clientRepository.save(client);
    }
    public Optional<Client> getClient(String id){
        return clientRepository.findById(id);
    }
}
