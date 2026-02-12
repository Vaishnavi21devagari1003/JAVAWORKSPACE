package com.example.thread.Shareddata;

public  class PrintEvenNum {
    static int i;
    public synchronized void printNum(){ //Synchronized is used to complete one thread task and then the  other thread task.
        //It is used because there should be no conflicts of the threads.
        for(i=0;i<=20;i++){
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
