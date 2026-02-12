package com.example.thread.Shareddata;

public class Thread1 extends Thread{
    PrintEvenNum obj;
    public Thread1(PrintEvenNum obj){
        this.obj=obj;
    }
    public void run(){
        obj.printNum();//this will execute the thread
    }
}
