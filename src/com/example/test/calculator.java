package com.example.test;

public class calculator {
    public int findBig(int a ,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public int findSmall(int a,int b){
        if(a>b){
            return b;
        }
        else{
            return a;
        }
    }
}
