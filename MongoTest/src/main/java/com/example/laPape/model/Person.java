package com.example.laPape.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Person {
    private String namePerson;
    private String lastNamePerson;
    private int agePerson;
    private String address;
    private List<Object> paymentMethod;
}
