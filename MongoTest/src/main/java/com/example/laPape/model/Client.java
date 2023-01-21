package com.example.laPape.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "client")
@Data
public class Client extends Person {
    @Id
    private String id;
    private String username;
    private String password;
}
