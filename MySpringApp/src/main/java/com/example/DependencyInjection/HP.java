package com.example.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HP implements Laptop {

    @Autowired
    @Qualifier("samsung")   // choose samsung disk
    private Harddisk harddisk;

    @Override
    public String getType() {
        return "HP Laptop with " + harddisk.getType();
    }
}