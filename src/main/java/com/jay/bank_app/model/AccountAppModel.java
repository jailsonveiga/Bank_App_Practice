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
}
