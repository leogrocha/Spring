package com.alura.aluraeventos.dominio;


public abstract class Account {
    private int idaccount;
    private Person person;
    private String numberAccount;
    private String dvAccount;
    private String agency;
    private double balance;

    public Account(int idaccount,Person person,String numberAccount, String dvAccount, String agency, double balance) {
        this.idaccount = idaccount;
        this.person = person;
        this.numberAccount = numberAccount;
        this.dvAccount = dvAccount;
        this.agency = agency;
        this.balance = balance;
    }

    public int getIdaccount() {
        return idaccount;
    }

    public Person getPerson() {
        return person;
    }

    public String getNumberAccount() {
        return numberAccount;
    }
    
    public String getDvAccount() {
        return dvAccount;
    }

    public String getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [idaccount=" + idaccount + ", person=" + person + ", numberAccount=" + numberAccount
                + ", dvAccount=" + dvAccount + ", agency=" + agency + ", balance=" + balance + "]";
    }
}
