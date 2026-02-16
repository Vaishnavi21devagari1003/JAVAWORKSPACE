package com.example.DependencyInjection;

import org.springframework.stereotype.Component;

@Component("samsung")
public class Samsung implements Harddisk {

    @Override
    public String getType() {
        return "Samsung Harddisk";
    }
}