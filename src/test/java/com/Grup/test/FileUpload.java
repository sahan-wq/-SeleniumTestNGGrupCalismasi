package com.Grup.test;

import com.Grup.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUpload extends TestBase {
    @Test
    public void testUpload(){
        System.getProperty("user.dir");

        System.getProperty("user.home");

        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("user.home"));
// D:\proje klasr\-SeleniumTestNGGrupCalismasi\target\xmc.jpeg

        boolean varmiburda= Files.exists(Paths.get("D:\\proje klasr\\-SeleniumTestNGGrupCalismasi\\target\\xmc.jpeg"));
        Assert.assertTrue(varmiburda);

// C:\Users\apple\Desktop\xmc.jpeg


    }
    @Test
    public void Upload() throws InterruptedException {
        //http://demo.guru99.com/test/upload/

        driver.get("http://demo.guru99.com/test/upload/");

     WebElement dosyaSec= driver.findElement(By.id("uploadfile_0"));
     dosyaSec.sendKeys("C:\\Users\\apple\\Desktop\\xmc.jpeg");

        driver.findElement(By.id("terms")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("submitbutton")).click();

        WebElement onayYazisi=driver.findElement(By.tagName("h3"));
        System.out.println("dosya= "+onayYazisi.getText());




    }
}
