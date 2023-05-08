package com.alura.aluraeventos.dominio;

public class AccountPF extends Account {
    private double monthlyIncome;
    
    public AccountPF(int idaccount, Person person, String numberAccount, String dvAccount, String agency,
            double balance, double monthlyIncome) {
        super(idaccount, person, numberAccount, dvAccount, agency, balance);
        this.monthlyIncome = monthlyIncome;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String toString() {
        return "AccountPF [monthlyIncome=" + monthlyIncome + "]";
    }
    
    

}
