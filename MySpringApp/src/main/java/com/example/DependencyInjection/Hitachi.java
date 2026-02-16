package com.example.DependencyInjection;

import org.springframework.stereotype.Component;

@Component("hitachi")
public class Hitachi implements Harddisk {

    @Override
    public String getType() {
        return "Hitachi Harddisk";
    }
}