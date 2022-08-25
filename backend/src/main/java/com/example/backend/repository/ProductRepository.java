package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
