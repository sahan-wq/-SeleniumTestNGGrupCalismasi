package com.Grup.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {
    @BeforeMethod

    @Test(priority = 4)
    public void liegeTest(){
        System.out.println("liegeTest");
    }
    @Test(priority = 2)
    public void zonguldakTest(){
        System.out.println("zonguldakTest");
    }
    @Test(priority =3 )
    public void hollandaTest(){
        System.out.println("hollandaTest");
    }
    @Test(priority = 1)
    public void belcikaTest(){
        System.out.println("belcikaTest");
    }
}
