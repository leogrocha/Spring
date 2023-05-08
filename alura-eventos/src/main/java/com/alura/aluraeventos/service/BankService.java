package com.alura.aluraeventos.service;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import com.alura.aluraeventos.dominio.Account;
import com.alura.aluraeventos.dominio.AccountPF;
import com.alura.aluraeventos.dominio.AccountPJ;
import com.alura.aluraeventos.dominio.IAccount;
import com.alura.aluraeventos.dominio.Person;

public class BankService implements IAccount {

    Person person = new Person(1, "Seu Madruga", "123.123.777-56");
    Person person2 = new Person(1, "Chaves LTDA", "45.127.484/0001-72");
    Account accountPF = new AccountPF(1,person,"8888","8","0153", 1000.00,5000.00);
    Account accountPJ = new AccountPJ(2, person2, "8888", "8", "0153", 1000.00, "123456");
    List<Account> list = new LinkedList<>(Arrays.asList(accountPF, accountPJ));


    public String checkBalance(int idaccount) {
        // Stream<Object> balance = list.stream()
        // .filter(value -> value.getIdaccount() == idaccount)
        // .map(value -> value.getBalance());

        double balance = 0.0;

        for (Account account : list) {
            if (account.getIdaccount() == idaccount) {
                balance = account.getBalance();
            }
        }
        
        return "R$ " + balance;
    }

    public long withdraw(int idaccount, double value) {
        
        // Verificar se o idaccount existe
        long verificateAccount = list.stream().filter(account -> account.getIdaccount() == idaccount).count();
        
        
        return verificateAccount;
    }

    public boolean deposit(int idaccountOrigin, int idaccountDestiny, double value) {
        return false;
    }

    public LinkedList<Account> showAccounts() {
        return (LinkedList<Account>) list;
    }

    public Stream<Account> accountPerson(int idperson) {
        
        Stream<Account> accounts = list.stream().filter(account -> account.getPerson().getidperson() == idperson);
        
        return accounts;
    }
    
}
