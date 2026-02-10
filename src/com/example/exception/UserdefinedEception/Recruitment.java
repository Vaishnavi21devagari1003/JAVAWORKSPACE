package com.example.exception.UserdefinedEception;

public class Recruitment {
    public void checkEligibility(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("You are hired");
        }
    }
}
