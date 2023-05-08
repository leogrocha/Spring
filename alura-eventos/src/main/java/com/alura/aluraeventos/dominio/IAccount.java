package com.alura.aluraeventos.dominio;


import java.util.LinkedList;
import java.util.stream.Stream;

public interface IAccount {
    
    public String checkBalance(int idaccount);

    public long withdraw(int idaccount, double value);

    public boolean deposit(int idaccountOrigin, int idaccountDestiny, double value);

    public LinkedList<Account> showAccounts();

    public Stream<Account> accountPerson(int idperson);

}
