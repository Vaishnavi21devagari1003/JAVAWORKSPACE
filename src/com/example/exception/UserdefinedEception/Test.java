package com.example.exception.UserdefinedEception;

public class Test {
    public static void main(String[] args) throws Exception {
        Recruitment r=new Recruitment();
        try{
            r.checkEligibility(13);
        }
        catch(InvalidAgeException x){
            throw new RuntimeException(x);
        }

    }
}

