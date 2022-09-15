package com.jay.bank_app.model;

import javax.persistence.*;

@Entity
public class AccountAppModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private Double accountBalance;
    private Double amountDeposited;
    private Double amountWithdrawn;

    public AccountAppModel() {
    }

public AccountAppModel(Long id, String name, String email, Integer age, String streetAddress, String city, String state, String country, String phoneNumber, Integer accountNumber, String accountType, Double accountBalance, Double amountDeposited, Double amountWithdrawn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.amountDeposited = amountDeposited;
        this.amountWithdrawn = amountWithdrawn;
    }
}
