package com.Grup.test;

import org.testng.annotations.Test;

public class DependsOnMethodsTest {
    /*
    @Test -> loginTesti()                   1
     @Test ->kullaniciBilgileriTesti        2
      @Test ->krediBilgileriTesti           3
       @Test ->sifreTesti                   4
        @Test ->adresBilgileriTesti         5

     */
    @Test
    public void login(){
        System.out.println("login");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }

    @Test(dependsOnMethods = "login")

    public void sifre(){
        System.out.println("sifre");
    }

}
