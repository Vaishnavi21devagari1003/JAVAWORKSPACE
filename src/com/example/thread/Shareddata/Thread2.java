package com.example.thread.Shareddata;


    public class Thread2 extends Thread{
        PrintEvenNum obj;
        public Thread2(PrintEvenNum obj){
            this.obj=obj;
        }
        public void run(){
            obj.printNum();//this will execute the thread
        }
    }


