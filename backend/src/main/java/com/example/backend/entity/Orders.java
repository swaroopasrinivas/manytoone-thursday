package com.example.backend.entity;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;



   @Column(name = "orderDate")
   @UpdateTimestamp
   private LocalDateTime lastUpdatedDate;



   @Column(name = "orderPrice")
    private double orderPrice;
   
   @Column(name = "userId")
   private long userId;



   @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<OrderItems> orderItems;



   @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade
            = CascadeType.PERSIST)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
   }