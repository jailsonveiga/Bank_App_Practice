package com.jay.bank_app.controller;

import com.jay.bank_app.model.AccountAppModel;
import com.jay.bank_app.repository.AccountAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bankapp")
public class AccountAppController {

    @Autowired
    private AccountAppRepo accountAppRepo;

    //@PostMapping("/create") update accountBalance in my database after deposit is made and account is created return the account balance from the database and the user details
    @PostMapping("/create")
    public ResponseEntity<AccountAppModel> createAccount(@RequestBody AccountAppModel accountAppModel) {
        accountAppModel.setAccountBalance(accountAppModel.getAmountDeposited());
        accountAppModel.setAmountDeposited(accountAppModel.getAmountDeposited());
        accountAppModel.setAmountWithdrawn(0.0);
        accountAppRepo.save(accountAppModel);
        return new ResponseEntity<>(accountAppModel, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<AccountAppModel> updateAccount(@PathVariable Long id, @RequestBody AccountAppModel updateAccount) {
        AccountAppModel accountAppModel = accountAppRepo.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        accountAppModel.setName(updateAccount.getName());
        accountAppModel.setEmail(updateAccount.getEmail());
        accountAppModel.setAge(updateAccount.getAge());
        accountAppModel.setStreetAddress(updateAccount.getStreetAddress());
        accountAppModel.setCity(updateAccount.getCity());
        accountAppModel.setState(updateAccount.getState());
        accountAppModel.setCountry(updateAccount.getCountry());
        accountAppModel.setPhoneNumber(updateAccount.getPhoneNumber());
        accountAppModel.setAccountNumber(updateAccount.getAccountNumber());
        accountAppModel.setAccountType(updateAccount.getAccountType());
        accountAppModel.setAccountBalance(updateAccount.getAccountBalance());
        accountAppModel.setAmountDeposited(updateAccount.getAmountDeposited());
        accountAppModel.setAmountWithdrawn(updateAccount.getAmountWithdrawn());
        AccountAppModel updateAccountAppModel = accountAppRepo.save(accountAppModel);
        return new ResponseEntity<>(updateAccountAppModel, HttpStatus.OK);
    }

    // @DeleteMapping delete user account by id

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable Long id) {
        accountAppRepo.deleteById(id);
       return new ResponseEntity<>(HttpStatus.OK);
   }

    // @GetMapping get user account details
    @GetMapping("/get/{id}")
    public ResponseEntity<AccountAppModel> getAccount(@PathVariable Long id) {
        AccountAppModel accountAppModel = accountAppRepo.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        return new ResponseEntity<>(accountAppModel, HttpStatus.OK);
    }

    // @GetMapping get all user account details
    @GetMapping("/getall")
    public ResponseEntity<Iterable<AccountAppModel>> getAllAccounts() {
        Iterable<AccountAppModel> accountAppModels = accountAppRepo.findAll();
        return new ResponseEntity<>(accountAppModels, HttpStatus.OK);
    }

    // @GetMapping get user account balance
    @GetMapping("/getbalance/{id}")
    public ResponseEntity<Double> getAccountBalance(@PathVariable Long id) {
        AccountAppModel accountAppModel = accountAppRepo.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        return new ResponseEntity<>(accountAppModel.getAccountBalance(), HttpStatus.OK);
    }

    // @getMapping update accountBalance in my database after deposit is made update the amountDeposited and return the account balance from the database and the user details
    @GetMapping("/deposit/{id}/{amountDeposited}")
    public ResponseEntity<AccountAppModel> deposit(@PathVariable Long id, @PathVariable Double amountDeposited) {
        AccountAppModel accountAppModel = accountAppRepo.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        accountAppModel.setAccountBalance(accountAppModel.getAccountBalance() + amountDeposited);
        accountAppModel.setAmountDeposited(amountDeposited);
        AccountAppModel updateAccountAppModel = accountAppRepo.save(accountAppModel);
        return new ResponseEntity<>(updateAccountAppModel, HttpStatus.OK);
    }

    // @getMapping update accountBalance in my database after withdrawal is made update the amountWithdrawn and return the account balance from the database and the user details
    @GetMapping("/withdraw/{id}/{amountWithdrawn}")
    public ResponseEntity<AccountAppModel> withdraw(@PathVariable Long id, @PathVariable Double amountWithdrawn) {
        AccountAppModel accountAppModel = accountAppRepo.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        accountAppModel.setAccountBalance(accountAppModel.getAccountBalance() - amountWithdrawn);
        accountAppModel.setAmountWithdrawn(amountWithdrawn);
        accountAppRepo.save(accountAppModel);
        return new ResponseEntity<>(accountAppModel, HttpStatus.OK);
    }
}

