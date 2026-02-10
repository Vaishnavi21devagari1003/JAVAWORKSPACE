package com.example.exception.UserdefinedEception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(){}

    public InvalidAgeException(String msg){
        super((msg));
    }

}
