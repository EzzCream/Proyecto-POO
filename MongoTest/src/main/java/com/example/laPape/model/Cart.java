package com.example.laPape.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "cart")
@Data
public class Cart {
    @Id
    private String id;
    private List<Object> productsInCart;
}
