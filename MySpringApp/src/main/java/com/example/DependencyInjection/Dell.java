package com.example.DependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dell implements Laptop {

    @Autowired
    @Qualifier("hitachi")   // choose hitachi disk
    private Harddisk harddisk;

    @Override
    public String getType() {
        return "Dell Laptop with " + harddisk.getType();
    }
}
