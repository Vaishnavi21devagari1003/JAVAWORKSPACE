package com.example.OptionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        String[] str =new String[5];
        Optional<String> check=Optional.ofNullable(str[4]);
        if(check.isEmpty()){
            System.out.println("String is Empty");
        }
        else{
            String lowercaseName = str[4].toLowerCase();
            System.out.println(lowercaseName);
        }
    }
}
