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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getAmountDeposited() {
        return amountDeposited;
    }

    public void setAmountDeposited(Double amountDeposited) {
        this.amountDeposited = amountDeposited;
    }

    public Double getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public void setAmountWithdrawn(Double amountWithdrawn) {
        this.amountWithdrawn = amountWithdrawn;
    }
}
