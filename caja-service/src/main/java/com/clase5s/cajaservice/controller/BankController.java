package com.clase5s.cajaservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping("/caja")
public class BankController {

    @Value("${message}")
    private String message;

    @Value("${domain-currency-enabled}")
    private List<Integer> domainCurrency;

    @Value("${max-amount-allowed}")
    private Integer maxAmount;

    @GetMapping("/denominaciones-permitidas")
    public List<Integer> getDomainCurrency() {

        /*Map mapOfDomain = new HashMap<>();

        domainCurrency.forEach(domain -> {
            mapOfDomain.put(domain.toString(), domain);
        });*/

        return domainCurrency;
    }

    @GetMapping("/maximo-permitido")
    public Map<String, Integer> getMaxAmountAllowed() {

        Map mapOfMaxAmount = new HashMap<>();

        mapOfMaxAmount.put("max", maxAmount);

        return mapOfMaxAmount;
    }
}
