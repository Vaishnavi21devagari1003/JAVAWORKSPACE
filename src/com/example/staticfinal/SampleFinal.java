package com.example.staticfinal;

public class SampleFinal {
    int x;
    final int y=100;
    final int z;
    static final int num=100;
    //final members must be initialized at the
    //time of declaration or in every constructor
    public SampleFinal(){
        z=100;
    }
    public SampleFinal(int a){
        z=a;
    }
    public SampleFinal(int a,int b){
        z=a;
        x=b;
    }
}
