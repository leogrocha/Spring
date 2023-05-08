package com.alura.aluraeventos.dominio;


public class AccountPJ extends Account {
    private String stateRegistration;

    public AccountPJ(int idaccount, Person person, String numberAccount, String dvAccount, String agency,
           double balance, String stateRegistration) {
        super(idaccount, person, numberAccount, dvAccount, agency, balance);
        this.stateRegistration = stateRegistration;
    }
    
    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }
}
