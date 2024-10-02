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

//    public List<Services> getServices(){
//        return serviceRepository.findAll();
//    }

    public Map<Bank, List<String>> getServices(){

//        List<Services> services = serviceRepository.findAll();
//
//        return services.stream().collect(Collectors.groupingBy(
//                Services::getBank,
//                Collectors.mapping(Services::getServiceName, Collectors.toList())
//        ));

        List<Bank> banks = bankRepository.findAllByOrderByBranchName(); // Assuming a method to fetch banks in order

        // Now create the map to store services
        Map<Bank, List<String>> servicesMap = new LinkedHashMap<>();
        for (Bank bank : banks) {
            List<Services> serviceList = serviceRepository.findByBank(bank); // Method to find services by bank
            List<String> serviceNames = serviceList.stream()
                    .map(Services::getServiceName)
                    .collect(Collectors.toList());
            servicesMap.put(bank, serviceNames);
        }
        return servicesMap;
    }
}
