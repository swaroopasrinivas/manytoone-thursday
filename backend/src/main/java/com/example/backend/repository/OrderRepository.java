package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer> {

}
