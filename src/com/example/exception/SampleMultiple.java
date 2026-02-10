package com.example.exception;

public class SampleMultiple {
    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
            System.out.println(z);
            int[] num = new int[5];
            num[5] = 0;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException x) {
            System.out.println(x.getMessage());
        }
        catch (Exception x){
            System.out.println("Array Issue");
            System.out.println(x.getMessage());
        }
        finally {
            System.out.println("I will get executed.");
        }
    }
}
