package com.alura.aluraeventos;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundo {

    public static LinkedList<Integer> showList() {
        LinkedList<Integer> list = new LinkedList<>();
        int contador = 0;
        
        while (contador != 10) {
            list.add(contador);
            contador++;
        }


        return list;
    } 
    
    @GetMapping("/oi")
    public LinkedList<Integer> digaOla() {
        return showList();
    }

}
