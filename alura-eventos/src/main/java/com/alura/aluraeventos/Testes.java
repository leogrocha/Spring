package com.alura.aluraeventos;

import com.alura.aluraeventos.service.BankService;

public class Testes {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        System.out.println(bankService.checkBalance(1));


        System.out.println(bankService.withdraw(1, 100.00));

    }
}
