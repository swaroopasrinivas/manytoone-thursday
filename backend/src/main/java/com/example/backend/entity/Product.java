package com.example.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {



   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;



   @Column(name = "product_name", unique = true)
    private String productName;



   @Column(name = "price")
    private double price;
    
    private double quantity;
    }
