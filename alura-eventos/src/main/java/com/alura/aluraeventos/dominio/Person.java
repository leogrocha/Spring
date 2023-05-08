package com.alura.aluraeventos.dominio;

public class Person {
    private int idperson;
    private String name;
    private String document;

    public Person(int idperson, String name, String document) {
        this.idperson = idperson;
        this.name = name;
        this.document = document;
    }

    public int getidperson() {
        return idperson;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }    
}
