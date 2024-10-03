package com.example.repository;

import com.example.entity.Bank;
import com.example.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Services, Integer> {

    List<Services> findByBank(Bank bank);
}
