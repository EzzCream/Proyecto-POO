package com.example.laPape.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "client")
@Data
public class Client extends Person {
    @Id
    private String id;
    private String username;
    private String password;
    private String idCart;
    private List<String> orders;
}
