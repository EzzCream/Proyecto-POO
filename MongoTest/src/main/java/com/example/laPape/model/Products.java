package com.example.laPape.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "products")
@Data
public class Products {
    @Id
    private String id;
    private String nameProduct;
    private String detailsProduct;
    private String categoryProduct;
    private float price;
    private int stock;
}
