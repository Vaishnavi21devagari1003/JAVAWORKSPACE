package com.example.OOPS.LambdaExpression;

public class Test {
    public static void main(String[] args) {
        Greeting g=new Greeting() {
            @Override
            public void greet() {
                System.out.println("HELLO");
            }

        };
       Greeting g1=()-> {System.out.println("HELLO");};
       g1.greet();
       Notable n=(String x)->{System.out.println(x);};
       n.note("Physics");
       Washable w=(String b)->{return "washing" +b ;};
        System.out.println(w.wash("shirt"));
       }
    }


//lambda Expression
//it works only with Functional Interface
//Leftside-->rightside
//arguments->body
//()->{