package com.javatechie.webflux.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
