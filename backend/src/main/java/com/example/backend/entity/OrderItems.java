package com.example.backend.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "orderItems")
public class OrderItems {



   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemId;



   @Column(name = "productId")
    private int productId;
    
//    @NotBlank(message = "ProductName id is mandatory")
    @Column(name = "productName")
    private String productName;
    
    @Column(name = "price")
    private double price;
    
    @Column(name = "quantity")
    private double quantity;
    
    



   @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "orderId", nullable = false)
    private Orders orders;
   }