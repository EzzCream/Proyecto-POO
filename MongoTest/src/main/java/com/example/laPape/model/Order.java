package com.example.laPape.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "order")
@Data
public class Order {
    @Id
    private String id;
    private double totalPrice;
    private String address;
    private String namePerson;
    private List<Object> paymentMethod;
    private List<Object> products;
}
