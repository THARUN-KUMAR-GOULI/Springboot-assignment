package com.example.repository;

import com.example.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {
    List<Bank> findByCity(String city);

    List<Bank> findAllByOrderByBranchName();
}
