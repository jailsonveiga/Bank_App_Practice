package com.jay.bank_app.repository;

import com.jay.bank_app.model.AccountAppModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountAppRepo extends JpaRepository<AccountAppModel, Long> {
}
