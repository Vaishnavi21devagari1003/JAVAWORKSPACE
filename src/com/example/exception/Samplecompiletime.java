package com.example.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Samplecompiletime {
    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
            System.out.println(z);
            int[] num = new int[5];
            num[5] = 0;
            //compiletime exception...Must include catch block or exeception.
            FileReader fr =new FileReader("Text1.txt");

        } catch (ArithmeticException e) {
            System.out.println("Cant / by zero");
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("Array issue");
            System.out.println(x.getMessage());
        } catch (Exception x) {
            System.out.println("Array issue");
            System.out.println(x.getMessage());
        }
//        catch(FileNotFoundException x){
//            System.out.println("File not found");
//            System.out.println(x.getMessage());
//        }
        finally{
            System.out.println("I will get executed.");
        }
    }
}