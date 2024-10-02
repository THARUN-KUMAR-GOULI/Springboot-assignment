package com.example.controller;

import com.example.entity.Bank;
import com.example.entity.Services;
import com.example.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService){
        this.bankService = bankService;
    }

    @GetMapping("/branches")
    public String getBankBranches(@RequestParam("city") String city, Model model){

        List<Bank> branches = bankService.getBranches(city);
        model.addAttribute("branches", branches);
        return "branches";
    }


    @GetMapping("/services")
    public String getServices(Model model){
        Map<Bank, List<String>> services = bankService.getServices();
        model.addAttribute("services", services);
        return "services";
    }
}
