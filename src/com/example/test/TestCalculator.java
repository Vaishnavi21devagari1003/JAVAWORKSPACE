package com.example.test;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestCalculator {
    @Test
    public void testfindBig(){
        calculator obj=new calculator();
        assertEquals(20,obj.findBig(10,20));
    }
    @Test
    public  void testFindSmall(){
        calculator obj=new calculator();
        assertEquals(10,obj.findSmall(10,20));
    }
}
