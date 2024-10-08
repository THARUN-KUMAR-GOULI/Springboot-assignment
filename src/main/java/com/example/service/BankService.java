package com.example.service;

import com.example.entity.Bank;
import com.example.entity.Services;
import com.example.repository.BankRepository;
import com.example.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BankService {

    private final BankRepository bankRepository;
    private final ServiceRepository serviceRepository;

    @Autowired
    public BankService(BankRepository bankRepository, ServiceRepository serviceRepository){
        this.bankRepository = bankRepository;
        this.serviceRepository = serviceRepository;
    }

    public List<Bank> getBranches(String city){
        return bankRepository.findByCity(city);
    }

    public Map<Bank, List<String>> getServices(){


        List<Bank> banks = bankRepository.findAllByOrderByBranchName();

        Map<Bank, List<String>> servicesMap = new LinkedHashMap<>();
        for (Bank bank : banks) {
            List<Services> serviceList = serviceRepository.findByBank(bank);
            List<String> serviceNames = serviceList.stream()
                    .map(Services::getServiceName)
                    .collect(Collectors.toList());
            servicesMap.put(bank, serviceNames);
        }
        return servicesMap;
    }
}
