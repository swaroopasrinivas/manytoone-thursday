package com.example.backend.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name = "user")
public class User {



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

//	@NotBlank(message = "First Name is mandatory")
    @Column(name = "first_name")
    private String firstName;



//   @NotBlank(message = "Last Name is mandatory")
    @Column(name = "last_name")
    private String lastName;
    
//    @Email
//    @NotBlank(message = "Email Id is mandatory")
    @Column(name = "email_id", unique = true)
    private String emailId;



//   @NotBlank(message = "Password is mandatory")
    @Column(name = "passWord", unique = true)
    private String passWord;



   @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Orders> orders;
   
   
   }