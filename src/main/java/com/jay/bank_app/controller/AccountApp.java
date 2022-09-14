package com.jay.bank_app.controller;

import javax.persistence.*;

@Entity
public class AccountApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String phoneNumber;
    private Integer accountNumber;
    private String accountType;
    private Long accountBalance;
    private Integer amountDeposited;
    private Integer amountWithdrawn;
}
