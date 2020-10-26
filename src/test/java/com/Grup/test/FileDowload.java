package com.Grup.test;

import com.Grup.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDowload extends TestBase {
    @Test
    public void dowloadTest() throws InterruptedException {
        driver.get("https://drive.google.com/file/d/1IRoKOLe-kJ4VtafJBfXZ9sXtzmUjJYDm/view?usp=sharing");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='ndfHFb-c4YZDc-Bz112c ndfHFb-c4YZDc-C7uZwb-LgbsSe-Bz112c ndfHFb-c4YZDc-nupQLb-Bz112c']")).click();

        boolean dosyaindimi= Files.exists(Paths.get("C:\\Users\\apple\\Downloads\\xmc.jpeg"));
        Thread.sleep(5000);
        Assert.assertTrue(dosyaindimi);

    }

}
