package com.example.backend.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Orders;
import com.example.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findById(long id);
//	
//	public default Set<Orders> getOrders(){
//		   return order;
//	   }
//	   
//	   
//	   public default void addOrder(Orders order) {
//		   this.orders.add(order);
//		   }
//	   
//	   public default void removeOrder(Orders order) {
//		   this.orders.remove(order);
//		   }
//	

}
