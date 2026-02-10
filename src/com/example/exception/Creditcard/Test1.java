package com.example.exception.Creditcard;

import java.util.Scanner;

    public class Test1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter credit card number");

            String cardno = sc.nextLine();

            try {

                if (cardno.length() != 16) {

                    throw new CreditCardException("Credit card number should be equal to 16");

                } else {

                    System.out.println("valid credit card number");

                }

            } catch (CreditCardException e) {

                System.out.println(e.getMessage());

            }

        }

    }



