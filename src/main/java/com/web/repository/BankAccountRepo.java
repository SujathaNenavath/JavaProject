package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.BankAccount;
@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount,Long> {

}
